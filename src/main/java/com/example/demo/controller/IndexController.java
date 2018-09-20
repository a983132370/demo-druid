package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @ClassName:
 * @Description:
 * @Author zhu
 * @Date 2018/9/20 15:36
 */
@RestController
@RequestMapping
public class IndexController {
    @Autowired
    TestService testService;

    /**
     * 返回视图
     * @param mv
     * @return
     */
    @RequestMapping("freemarker")
    public ModelAndView index(ModelAndView mv){
        mv.setViewName("freemark");
        return mv;
    }

    /**
     * 返回字符串
     * @return
     */
    @RequestMapping("home")
    public String home(){
        return "home 字符串";
    }

    /**
     * 返回db查询数据
     * @return
     */
    @RequestMapping("db")
    public List<Test> db(){
        return testService.findAll();
    }
}
