package com.najia.quan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {

    /**
     * 允许跨域资源共享
     * @return WebMvcConfigurer
     */
    @Bean
    public WebMvcConfigurer corsConf() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedHeaders("*")
                        .allowedOrigins("*")
                        .allowCredentials(true)
                        .maxAge(3600)
                        .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE");
            }
        };
    }
}
