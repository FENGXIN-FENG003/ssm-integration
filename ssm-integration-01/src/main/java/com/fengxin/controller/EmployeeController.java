package com.fengxin.controller;

import com.fengxin.pojo.Employee;
import com.fengxin.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/
@RestController
@RequestMapping("emp")
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    @GetMapping("all")
    public List<Employee> selectAll(){
        List<Employee> list = employeeService.selectAll ();
        System.out.println ("list = " + list);
        return list;
    }
}
