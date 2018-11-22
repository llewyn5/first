package com.llewyn.mybatis.controller;

import com.llewyn.mybatis.bean.Em;
import com.llewyn.mybatis.mapper.EmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmController {

    @Autowired
    EmMapper emMapper;
    //pathVariable获取路径变量id的值
    @GetMapping("/dept/{id}")
    public Em getEm(@PathVariable("id") Integer id){
        return emMapper.getId(id);
    }

}
