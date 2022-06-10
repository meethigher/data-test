package com.baiduj.datatest.datatest.service.impl;

import com.baiduj.datatest.datatest.service.DataTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

@Service
public class DataTestServiceImpl implements DataTestService {
    private final Logger log = LoggerFactory.getLogger(DataTestServiceImpl.class);

    @Override
    public List<String> calc() throws Exception {
        log.info("start");
        List<String> list = new LinkedList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(ResourceUtils.getFile("classpath:test.txt")));
        String txt = null;
        int i=0;
        while ((txt = bufferedReader.readLine()) != null) {
            list.add(txt);
        }
        log.info("end, list size {}", list.size());
        return list;
    }
}
