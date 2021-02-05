package com.cong.springcloudhystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HystrixController {

    @GetMapping("/call-all-student")
    @HystrixCommand(fallbackMethod = "defaultCallAllStudent")
    public String callHello() {
        return new RestTemplate().getForObject("http://localhost:9001/api/student/all", String.class);
    }

    public String defaultCallAllStudent(){
        return "Trang Default khi service bi DOWN!!!";
    }
}
