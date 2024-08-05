package com.fengxin.service.impl;

import com.fengxin.mapper.EmployeeMapper;
import com.fengxin.pojo.Employee;
import com.fengxin.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> selectAll () {
        return employeeMapper.queryAll ();
    }
}
