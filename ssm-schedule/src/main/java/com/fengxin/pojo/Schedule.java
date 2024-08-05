package com.fengxin.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author FENGXIN
 * @date 2024/8/5
 * @project ssm-integration-part
 * @description 实体类
 **/
@Data
public class Schedule {
    private Integer id;
    @NotBlank
    private String title;
    @NotNull
    private Boolean completed;
}
