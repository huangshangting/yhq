package com.najia.quan.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.najia.quan.taobao.mapper","com.najia.quan.taobao.mapperOwn"})
public class TaobaoConfig {

}
