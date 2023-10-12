package com.smhrd.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.test.entity.test;

@Mapper
public interface testMapper {
    public List<test> testList();
}
