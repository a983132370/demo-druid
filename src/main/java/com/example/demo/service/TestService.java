package com.example.demo.service;

import com.example.demo.entity.Test;
import com.example.demo.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName:
 * @Description:
 * @Author zhu
 * @Date 2018/9/20 15:46
 */
@Service
public class TestService {
    @Autowired
    TestMapper testMapper;
    public List<Test> findAll(){
        return testMapper.findAll();
    }

}
