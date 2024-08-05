package com.fengxin.service;

import com.fengxin.pojo.Schedule;
import com.fengxin.utils.R;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description
 **/
public interface ScheduleService {
    R queryPage(int pageSize, int currentPage);
    
    R delete (Integer id);
    
    R save (Schedule schedule);
    
    R update (Schedule schedule);
}
