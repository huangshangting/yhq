package com.najia.quan.taobao.mapper;

import com.najia.quan.taobao.model.ProductSelected;

public interface ProductSelectedMapper {
    int deleteByPrimaryKey(Integer selectedId);

    int insert(ProductSelected record);

    int insertSelective(ProductSelected record);

    ProductSelected selectByPrimaryKey(Integer selectedId);

    int updateByPrimaryKeySelective(ProductSelected record);

    int updateByPrimaryKey(ProductSelected record);
}