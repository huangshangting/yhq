package com.najia.quan.taobao.service;

import com.github.pagehelper.PageInfo;
import com.najia.quan.taobao.model.ProductSelected;

import java.util.List;

public interface ProductSelectedService {

    public void fetchData();

    PageInfo<ProductSelected> getByMaterialId(int pageNo, int pageSize, long materialId);

    PageInfo<ProductSelected> getFromApiByMaterialId(long pageNo, long pageSize, long materialId);
}
