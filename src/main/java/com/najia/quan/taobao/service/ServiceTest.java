package com.najia.quan.taobao.service;

import com.najia.quan.taobao.bo.productSearch.ProductSearchMapData;

import java.util.List;

public interface ServiceTest {

    public ProductSearchMapData search(String question);

    public List<ProductSearchMapData> searchList(String question);

    public String getName();
}
