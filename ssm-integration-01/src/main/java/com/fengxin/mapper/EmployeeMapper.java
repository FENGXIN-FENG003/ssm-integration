package com.fengxin.mapper;

import com.fengxin.pojo.Employee;

import java.util.List;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/
public interface EmployeeMapper {
    // 查询全部员工信息
    List<Employee> queryAll();
}
