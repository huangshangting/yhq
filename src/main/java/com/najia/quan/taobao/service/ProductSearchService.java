package com.najia.quan.taobao.service;

import com.najia.quan.taobao.bo.productSearch.ProductSearchMapData;

import java.util.List;

public interface ProductSearchService {

    public List<ProductSearchMapData> searchList(String question);
}
