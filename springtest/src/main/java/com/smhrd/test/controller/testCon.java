package com.smhrd.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.test.entity.test;
import com.smhrd.test.service.testService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class testCon {

    @Autowired
    private testService testService;

    @RequestMapping("/test.do")
    public List<test> test() {
        System.out.println("흠...");
        return testService.test();
    }
}
