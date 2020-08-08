package com.najia.quan.taobao.mapperOwn;

import com.najia.quan.taobao.model.ProductSelected;

import java.util.List;

public interface ProductSelectedMapperOwn {
    Integer selectByItemId(Long itemId);

    List<ProductSelected> selectByMaterialId(long materialId);
}