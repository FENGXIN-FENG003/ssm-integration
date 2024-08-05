package com.fengxin.mapper;

import com.fengxin.pojo.Schedule;

import java.util.List;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/
public interface ScheduleMapper {
    List<Schedule> queryPage();
    int delete(int id);
    
    int save (Schedule schedule);
    
    int update (Schedule schedule);
}
