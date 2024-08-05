package com.fengxin.controller;

import com.fengxin.pojo.Schedule;
import com.fengxin.service.ScheduleService;
import com.fengxin.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/
@RestController
@RequestMapping("schedule")
@Slf4j
// 解决跨域问题
@CrossOrigin
public class ScheduleController {
    @Autowired
    private ScheduleService service;
    
    /**
     * 分页查询
     * @param pageSize 当前页的数据量
     * @param currentPage 当前页
     * @return r
     */
    @GetMapping("/{pageSize}/{currentPage}")
    public R queryPage(@PathVariable(value = "pageSize") int pageSize,@PathVariable(value = "currentPage") int currentPage){
        R r = service.queryPage (pageSize,currentPage);
        // 输出日志
        log.info ("查询结果:{}",r);
        // 返回结果
        return r;
    }
    
    @DeleteMapping("/{id}")
    public R delete(@PathVariable(value = "id") Integer id){
        return service.delete(id);
    }
    
    @PostMapping()
    public R save(@Validated @RequestBody Schedule schedule, BindingResult bindingResult){
        if(bindingResult.hasErrors ()){
            return R.fail ("参数格式不符合！无法保存");
        }
        return service.save(schedule);
    }
    
    @PutMapping
    public R update(@Validated @RequestBody Schedule schedule, BindingResult bindingResult){
        if(bindingResult.hasErrors ()){
            return R.fail ("参数格式不符合！无法更新");
        }
        return service.update(schedule);
    }
}
