package com.fengxin.service.impl;

import com.fengxin.mapper.ScheduleMapper;
import com.fengxin.pojo.Schedule;
import com.fengxin.service.ScheduleService;
import com.fengxin.utils.PageBean;
import com.fengxin.utils.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
public class ScheduleServiceImpl implements ScheduleService {
    @Resource
    private ScheduleMapper scheduleMapper;
    @Override
    public R queryPage (int pageSize, int currentPage) {
        // 分页
        PageHelper.startPage (currentPage,pageSize);
        // 查询
        List<Schedule> schedules = scheduleMapper.queryPage ();
        System.out.println ("schedules = " + schedules);
        // 数据装配
        PageInfo<Schedule> pageInfo = new PageInfo<> (schedules);
        // 返回页数据
        PageBean<Schedule> pageBean = new PageBean<> (currentPage,pageSize,pageInfo.getTotal (),pageInfo.getList ());
        return R.ok (pageBean);
    }
    
    @Override
    public R delete (Integer id) {
        int rows = scheduleMapper.delete (id);
        // 删除成功
        if(rows > 0){
            return R.ok (null);
        }
        // 删除失败
        return R.fail (null);
    }
    
    @Override
    public R save (Schedule schedule) {
        int rows = scheduleMapper.save (schedule);
        if(rows > 0){
            return R.ok (null);
        }
        // 保存失败
        return R.fail (null);
    }
    
    @Override
    public R update (Schedule schedule) {
        int rows = scheduleMapper.update (schedule);
        if(rows > 0){
            return R.ok (null);
        }
        // 更新失败
        return R.fail (null);
    }
}
