package com.smhrd.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.test.mapper.testMapper;
import com.smhrd.test.entity.test;

@Service
public class testService {

    @Autowired
    private testMapper testMapper;

    public List<test> test() {
        List<test> testList = testMapper.testList();

        return testList;
    }

    public String test2() {

        return "안녕하세요?";
    }
}
