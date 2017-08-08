package com.example.demo.service.impl;

import com.example.demo.dao.TestMapper;
import com.example.demo.domain.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestMapper testMapper;

    @Override
    public Test queryList(Integer id) {
        return testMapper.queryList(id);
    }
}
