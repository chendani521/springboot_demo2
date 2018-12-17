package com.baizhi.controller;


import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpMapper empMapper;

    @RequestMapping("/delete")
    public void delete() {

        empMapper.deleteByPrimaryKey(1002);
        System.out.println(empMapper.deleteByPrimaryKey(1002));
    }
}
