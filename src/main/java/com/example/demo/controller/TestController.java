package com.example.demo.controller;

import com.example.demo.dao.TestMapper;
import com.example.demo.domain.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(String aa){
        return aa;
    }

    @GetMapping("/testdb")
    public Test testdb(Integer id){
        Test test = testMapper.queryList(id);
        return test;
    }
}
