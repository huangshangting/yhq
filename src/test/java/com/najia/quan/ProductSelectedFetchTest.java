package com.najia.quan;

import com.najia.quan.taobao.service.ProductSelectedService;
import com.najia.quan.taobao.service.impl.ProductSelectedServiceImpl;
import lombok.Data;
import org.junit.Test;
import org.springframework.beans.BeanUtils;


public class ProductSelectedFetchTest {


    ProductSelectedService productSelectedService = new ProductSelectedServiceImpl();

    @Test
    public void testFetch() {
        productSelectedService.fetchData();
    }

    @Test
    public void beanCopyTest() {
        Person p1 = new Person();
        p1.setName("p1");

        Person p2 = new Person();
        p2.setName("p1");
        p2.setAge("26");
        BeanUtils.copyProperties(p1, p2,"age");
        System.out.println(p2);
    }

    @Data
    static class Person {
        private String name;

        private String age;

    }
}
