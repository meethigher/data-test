package com.baiduj.datatest.datatest.controller;

import com.baiduj.datatest.datatest.service.DataTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataTestController {

    @Autowired
    private DataTestService dataTestService;

    @PostMapping("calc")
    public List<String> calc() throws Exception {
        return dataTestService.calc();
    }

}
