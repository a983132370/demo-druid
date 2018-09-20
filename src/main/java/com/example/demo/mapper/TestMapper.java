package com.example.demo.mapper;

import com.example.demo.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName:
 * @Description:
 * @Author zhu
 * @Date 2018/9/20 15:42
 */
@Mapper
public interface TestMapper {

    @Select("select id,name from test")
    List<Test> findAll();

}
