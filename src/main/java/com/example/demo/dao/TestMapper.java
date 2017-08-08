package com.example.demo.dao;

import com.example.demo.domain.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper{
    public Test queryList(Integer id);
}
