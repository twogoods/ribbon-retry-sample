package com.tg.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController()
public class CommonController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/call")
    public String call() {
        String result = restTemplate.getForObject("http://provider/echo", String.class);
        return "call response = " + result;
    }
}
