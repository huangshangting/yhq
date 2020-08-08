package com.najia.quan.taobao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.najia.quan.taobao.CommonConst;
import com.najia.quan.taobao.mapper.ProductSelectedMapper;
import com.najia.quan.taobao.mapperOwn.ProductSelectedMapperOwn;
import com.najia.quan.taobao.model.ProductSelected;
import com.najia.quan.taobao.service.ProductSelectedService;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgOptimusMaterialRequest;
import com.taobao.api.response.TbkDgOptimusMaterialResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ProductSelectedServiceImpl implements ProductSelectedService {
    private static final Logger log = LoggerFactory.getLogger(ProductSelectedServiceImpl.class);

    @Autowired
    ProductSelectedMapper productSelectedMapper;
    @Autowired
    ProductSelectedMapperOwn productSelectedMapperOwn;

    @Override
    public void fetchData() {

        TaobaoClient client = new DefaultTaobaoClient(CommonConst.TAOBAO_URL, CommonConst.APP_KEY, CommonConst.APP_SECRET);
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageSize(CommonConst.MAX_PAGE_SIZE);
        req.setAdzoneId(CommonConst.ADZONEID);

        List<Long> catLists = CommonConst.catList;
        for (Long catId : catLists) {
            long pageNo = 1L;
            req.setMaterialId(catId);
            boolean isNextCat = false;
            while (!isNextCat) {
                req.setPageNo(pageNo);
                TbkDgOptimusMaterialResponse rsp = null;
                try {
                    rsp = client.execute(req);
                } catch (ApiException e) {
                    log.error("connect taobao failed.");
                    e.printStackTrace();
                }
                if (rsp == null) {
                    isNextCat = true;
                    continue;
                }
                List<TbkDgOptimusMaterialResponse.MapData> mapDataList = rsp.getResultList();
                if (mapDataList == null || mapDataList.size() == 0) {
                    isNextCat = true;
                } else {
                    // 解析返回数据
                    parseResData(mapDataList, catId);
                }
                pageNo++;
            }
        }

       /*req.setDeviceValue("xxx");
        req.setDeviceEncrypt("MD5");
        req.setDeviceType("IMEI");
        req.setContentId(323L);
        req.setContentSource("xxx");
        req.setItemId(33243L);
        req.setFavoritesId("123445");*/
    }

    private void parseResData(List<TbkDgOptimusMaterialResponse.MapData> mapDataList, Long catId) {
        for (TbkDgOptimusMaterialResponse.MapData data : mapDataList) {
            ProductSelected productSelected = new ProductSelected();
            BeanUtils.copyProperties(data, productSelected);
            productSelected.setUpdateTime(new Date().getTime());
            // 根据item id 判断是否存在数据库
            Integer selectId = productSelectedMapperOwn.selectByItemId(data.getItemId());
            if (selectId != null) {
                productSelected.setSelectedId(selectId);
                productSelectedMapper.updateByPrimaryKeySelective(productSelected);
                System.out.println("update" + selectId);
            } else {
                productSelected.setCreateTime(new Date().getTime());
                productSelected.setMaterialId(catId);
                productSelectedMapper.insertSelective(productSelected);
                System.out.println("insert" + productSelected.getItemId());
            }
        }
    }

    @Override
    public PageInfo<ProductSelected> getByMaterialId(int pageNo, int pageSize, long materialId) {
        long startTime = System.currentTimeMillis();
        PageHelper.startPage(pageNo, pageSize);
        List<ProductSelected> productSelectedList = productSelectedMapperOwn.selectByMaterialId(materialId);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        return new PageInfo<>(productSelectedList);
    }

    @Override
    public PageInfo<ProductSelected> getFromApiByMaterialId(long pageNo, long pageSize, long materialId) {
        TaobaoClient client = new DefaultTaobaoClient(CommonConst.TAOBAO_URL, CommonConst.APP_KEY, CommonConst.APP_SECRET);
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageNo(pageNo);
        req.setPageSize(pageSize);
        req.setAdzoneId(CommonConst.ADZONEID);
        req.setMaterialId(materialId);
        TbkDgOptimusMaterialResponse rsp = null;
        List<ProductSelected> selectedList = new ArrayList<>();
        try {
            rsp = client.execute(req);
            // 没数据再请求一遍
            if (rsp == null) {
                rsp = client.execute(req);
            }
        } catch (ApiException e) {
            log.error("connect taobao failed.");
            e.printStackTrace();
        }
        if (rsp == null) {
            log.warn("rsp is null.");
            return new PageInfo<>(selectedList);
        }
        List<TbkDgOptimusMaterialResponse.MapData> mapDataList = rsp.getResultList();
        for (TbkDgOptimusMaterialResponse.MapData data : mapDataList) {
            ProductSelected selected = new ProductSelected();
            BeanUtils.copyProperties(data, selected);
            selectedList.add(selected);
        }
        PageInfo<ProductSelected> pageInfo = new PageInfo<>(selectedList);
        pageInfo.setPageNum((int)pageNo);
        pageInfo.setPageSize((int)pageSize);
        return pageInfo;
    }
}
