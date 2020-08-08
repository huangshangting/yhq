package com.najia.quan.taobao;

import com.najia.quan.taobao.service.ProductSelectedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {

    @Autowired
    ProductSelectedService selectedService;

    @Scheduled(cron = "0 0 0 * * ?")
    public void fetchDataTask() {
        selectedService.fetchData();
    }
}
