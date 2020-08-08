package com.najia.quan.taobao.service.impl;

import com.najia.quan.taobao.CommonConst;
import com.najia.quan.taobao.bo.productSearch.KouLingRes;
import com.najia.quan.taobao.bo.productSearch.ProductSearchMapData;
import com.najia.quan.taobao.service.ProductSearchService;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductSearchServiceImpl implements ProductSearchService {

    @Override
    public List<ProductSearchMapData> searchList(String question) {

        String keyWord = handleQuestion(question);
        if (StringUtils.isEmpty(keyWord)) {
            keyWord = question;
        }
        TaobaoClient client = new DefaultTaobaoClient(CommonConst.TAOBAO_URL, CommonConst.APP_KEY, CommonConst.APP_SECRET);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
        req.setQ(keyWord);
//        req.setHasCoupon(true);
        req.setAdzoneId(CommonConst.ADZONEID);
        req.setPageNo(1L);
        req.setPageSize(20L);
        TbkDgMaterialOptionalResponse rsp = null;
        List<TbkDgMaterialOptionalResponse.MapData> dataList = new ArrayList<>();
        List<ProductSearchMapData> resList = new ArrayList<>();
        try {
            rsp = client.execute(req);
            if (rsp == null) {
                rsp = client.execute(req);
            }
            if (rsp == null) {
                return resList;
            }
            // 如果还是空，抛出业务异常
            dataList = rsp.getResultList();
            // 如果没有数据，再试一次
            if (dataList == null) {
                dataList = client.execute(req).getResultList();
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
        if(dataList == null) {
            return resList;
        }
        for (TbkDgMaterialOptionalResponse.MapData data : dataList) {
            ProductSearchMapData productSearchMapData = new ProductSearchMapData();
            BeanUtils.copyProperties(data, productSearchMapData);
            resList.add(productSearchMapData);
        }
        return resList;
    }

    private String handleQuestion(String question) {
        if (question == null) {
            return CommonConst.DEFAUL_KOULING_QUESTION;
        }
        String koulingParam;
        if (question.length() > CommonConst.KOULING_PARAM_LENGTH) {
            koulingParam = question.substring(0, CommonConst.KOULING_PARAM_LENGTH);
        } else {
            koulingParam = question;
        }
        String url = CommonConst.KOULING_URL + koulingParam;
        RestTemplate template = new RestTemplate();
        ResponseEntity<KouLingRes> res = template.getForEntity(url, KouLingRes.class);
        HttpStatus temStatus = res.getStatusCode();
        if (temStatus != HttpStatus.OK) {
            return CommonConst.DEFAUL_KOULING_QUESTION;
        }
        KouLingRes kouLingRes =  res.getBody();
        if (kouLingRes == null) {
            return CommonConst.DEFAUL_KOULING_QUESTION;
        }
        if (!kouLingRes.getCode().equals(CommonConst.KOULING_RET_CODE_OK)) {
            return CommonConst.DEFAUL_KOULING_QUESTION;
        }
        String parseUrl = kouLingRes.getUrl();
        if (StringUtils.isEmpty(parseUrl)) {
            return CommonConst.DEFAUL_KOULING_QUESTION;
        }
        String[] itemIds = parseUrl.split(CommonConst.ITEMID_MATCH_STR);
        String idItemUrl = getIdUrl(itemIds);
        if (idItemUrl != null) {
            return idItemUrl;
        }
        String[] ids = parseUrl.split(CommonConst.ID_MATCH_STR);
        String idUrl = getIdUrl(ids);
        if (idUrl != null) {
            return idUrl;
        }

        // 哎淘宝特殊情况
        String[] aiTaoBaos = parseUrl.split(CommonConst.I_MATCH_STR);
        if (aiTaoBaos.length == CommonConst.STRSPLIT_LENGTH) {
            String aiIdStr = aiTaoBaos[1];
            String[] aiIds = aiIdStr.split(CommonConst.DOT_CHART);
            if (aiIds.length > CommonConst.STRSPLIT_LENGTH) {
                return CommonConst.TAOID_URL + aiIds[0];
            }
        }
        return CommonConst.DEFAUL_KOULING_QUESTION;
    }

    private String getIdUrl(String[] itemIds) {
        if (itemIds.length == CommonConst.STRSPLIT_LENGTH) {
            String idStr = itemIds[1];
            String[] ids = idStr.split(CommonConst.PARAM_CONNECT_CHART);
            if (ids.length > CommonConst.STRSPLIT_LENGTH) {
                String id = ids[0];
                return CommonConst.TAOID_URL + id;
            }
        }
        return null;
    }


}
