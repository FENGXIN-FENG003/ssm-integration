package com.fengxin.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description 存储分页数据
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean<T> {
    // 当前页码
    private int currentPage;
    // 每页显示的数据量
    private int pageSize;
    // 总数据条数
    private long total;
    // 当前页的数据集合
    private List<T> data;
}
