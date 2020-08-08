package com.najia.quan.taobao.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.najia.quan.taobao.bo.productSearch.ProductSearchMapData;
import com.najia.quan.taobao.mapper.UserMapper;
import com.najia.quan.taobao.model.User;
import com.najia.quan.taobao.service.ServiceTest;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkDgOptimusMaterialRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import com.taobao.api.response.TbkDgOptimusMaterialResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceTestImpl implements ServiceTest {

    private static final String TAOBAO_URL = "http://gw.api.taobao.com/router/rest";

    private static final String APP_KEY = "30139857";

    private static final String APP_SECRET = "c08ccb3ff49a222149b3f1876f25cad0";

    private static final long  ADZONEID = 110495600319L;

    private static final String SERCH  = "https://detail.tmall.com/item.htm?id=605735757618";

    @Autowired
    UserMapper userMapper;

    public ProductSearchMapData search(String question) {
        ProductSearchMapData data = new ProductSearchMapData();
        JSONObject resObj = getResJsonObject(question);
        if (resObj == null) {
            resObj = getResJsonObject(question);
            if (resObj == null) {
//                data.setCouponShareUrl("无优惠券或淘宝罢工，请再试试！");
                return data;
            }
        }
        JSONObject resListObj = resObj.getJSONObject("result_list");
        JSONArray mapDataArray = resListObj.getJSONArray("map_data");
        JSONObject mapData = mapDataArray.getJSONObject(0);
        data = JSONObject.toJavaObject(mapData, ProductSearchMapData.class);
        if (data.getCouponShareUrl() == null) {
            data.setCouponShareUrl(data.getUrl());
        }else {
            data.setCouponShareUrl(data.getCouponShareUrl());
        }

        data.setUrl(data.getUrl());
        return data;
    }

    private JSONObject getResJsonObject(String question) {
        TaobaoClient client = new DefaultTaobaoClient(TAOBAO_URL, APP_KEY, APP_SECRET);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();

        req.setQ(question);
        req.setHasCoupon(true);
        req.setAdzoneId(ADZONEID);
        TbkDgMaterialOptionalResponse rsp = null;
        try {
            rsp = client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(rsp.getBody());
        JSONObject bodyObj = JSONObject.parseObject(rsp.getBody());
        return bodyObj.getJSONObject("tbk_dg_material_optional_response");
    }

    @Override
    public List<ProductSearchMapData> searchList(String question) {
        List<ProductSearchMapData> dataList = new ArrayList<>();
        JSONObject resObj = getResJsonObject(question);
        if (resObj == null) {
            resObj = getResJsonObject(question);
            if (resObj == null) {
//                data.setCouponShareUrl("无优惠券或淘宝罢工，请再试试！");
                return dataList;
            }
        }
        JSONObject resListObj = resObj.getJSONObject("result_list");
        JSONArray mapDataArray = resListObj.getJSONArray("map_data");
        dataList = mapDataArray.toJavaList(ProductSearchMapData.class);
        for (ProductSearchMapData data : dataList) {
            if (data.getCouponShareUrl() == null) {
                data.setCouponShareUrl(data.getUrl());
            }else {
                data.setCouponShareUrl(data.getCouponShareUrl());
            }

            data.setUrl(data.getUrl());
        }
        return dataList;
    }

    public String getName() {
        User user = userMapper.selectByPrimaryKey(1);
        return user.getName();
    }

    public void selected() {
        TaobaoClient client = new DefaultTaobaoClient(TAOBAO_URL, APP_KEY, APP_SECRET);
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageSize(20L);
        req.setAdzoneId(123L);
        req.setPageNo(1L);
        req.setMaterialId(123L);
        req.setDeviceValue("xxx");
        req.setDeviceEncrypt("MD5");
        req.setDeviceType("IMEI");
        req.setContentId(323L);
        req.setContentSource("xxx");
        req.setItemId(33243L);
        req.setFavoritesId("123445");
        TbkDgOptimusMaterialResponse rsp = null;
        try {
            rsp = client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(rsp.getBody());
    }
}
