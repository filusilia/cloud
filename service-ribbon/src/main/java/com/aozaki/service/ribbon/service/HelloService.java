package com.aozaki.service.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Aozaki on 2018/11/7.
 * @version 1.0
 * @since 1.0
 */
@Service
public class HelloService {
    private final RestTemplate restTemplate;

    @Autowired
    public HelloService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hiService(String name) {
        return restTemplate.getForObject("http://CLIENT-ONE/hi?name=" + name, String.class);
    }
}
