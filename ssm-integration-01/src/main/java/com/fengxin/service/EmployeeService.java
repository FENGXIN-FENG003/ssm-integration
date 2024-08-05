package com.fengxin.service;

import com.fengxin.pojo.Employee;

import java.util.List;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/
public interface EmployeeService {
    List<Employee> selectAll();
}
