package com.najia.quan.taobao.taobaoApi;

import com.najia.quan.taobao.service.ProductSelectedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 获取淘宝数据
 */
@Component
public class ProductSelectedFetch {

    @Autowired
    ProductSelectedService productSelectedService;


    public void main1() {
        productSelectedService.fetchData();
    }
}
