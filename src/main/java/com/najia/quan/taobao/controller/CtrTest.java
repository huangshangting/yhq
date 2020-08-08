package com.najia.quan.taobao.controller;

import com.github.pagehelper.PageInfo;
import com.najia.quan.taobao.bo.productSearch.ProductSearchMapData;
import com.najia.quan.taobao.model.ProductSelected;
import com.najia.quan.taobao.service.ProductSearchService;
import com.najia.quan.taobao.service.ProductSelectedService;
import com.najia.quan.taobao.service.ServiceTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class CtrTest {

    @Autowired
    ServiceTest serviceTest;
    @Autowired
    ProductSelectedService productSelectedService;
    @Autowired
    ProductSearchService searchService;

    @ResponseBody
    @RequestMapping("/two")
    public String test(String question) {

        return "";
    }

    @ResponseBody
    @RequestMapping("/name")
    public String getName() {
        return serviceTest.getName();
    }

    @RequestMapping("/index")
    public String indexPage() {

        return "/taobao/index";
    }

    @RequestMapping("/search")
    public String searchPage() {

        return "/taobao/search";
    }

    @ResponseBody
    @RequestMapping("/search/qes")
    public ModelMap search(String searchValue) {
        ProductSearchMapData data = serviceTest.search(searchValue);
        ModelMap map = new ModelMap();
        map.addAttribute("urlStr", data.getCouponShareUrl());
        map.addAttribute("urlImg", data.getPictUrl());
        return map;
    }

    @ResponseBody
    @RequestMapping("/search/react")
    public ModelMap searchR(String searchValue) {
        ProductSearchMapData data = serviceTest.search(searchValue);
        ModelMap map = new ModelMap();
        map.addAttribute("discountUrl", data.getCouponShareUrl());
        map.addAttribute("srcUrl", data.getPictUrl());
        map.addAttribute("productName", data.getShortTitle());
        map.addAttribute("productShop", data.getShopTitle());
        return map;
    }

    @ResponseBody
    @RequestMapping("/search/reactListJson")
    public List<ModelMap> searchListJson(String q) {
        List<ProductSearchMapData> dataList = serviceTest.searchList(q);
        List<ModelMap> modelMaps = new ArrayList<>();
        for (ProductSearchMapData data : dataList) {
            ModelMap map = new ModelMap();
            map.addAttribute("couponShareUrl", data.getCouponShareUrl());
            map.addAttribute("pictUrl", data.getPictUrl());
            map.addAttribute("title", data.getShortTitle());
            map.addAttribute("nick", data.getShopTitle());
            modelMaps.add(map);
        }
        return modelMaps;
    }

    @ResponseBody
    @RequestMapping("/search/reactList")
    public List<ProductSearchMapData> searchList(String q) {
        return searchService.searchList(q);
    }

    @ResponseBody
    @RequestMapping("/fetch/test")
    public void testFetch() {
        productSelectedService.fetchData();
    }

    @ResponseBody
    @RequestMapping("/fetch/materialDb")
    public PageInfo<ProductSelected> testFetchMaterialId(@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize,
                                                         @RequestParam("materialId")long materialId) {
        return productSelectedService.getByMaterialId(pageNo, pageSize, materialId);
    }

    @ResponseBody
    @RequestMapping("/fetch/material")
    public PageInfo<ProductSelected> fetchMaterialId(@RequestParam("pageNo")int pageNo, @RequestParam("pageSize")int pageSize,
                                                         @RequestParam("materialId")long materialId) {
        return productSelectedService.getFromApiByMaterialId(pageNo, pageSize, materialId);
    }
}
