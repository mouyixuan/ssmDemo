package com.uppower.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/7/1 12:49
 * @description：职工表
 * @modified By：
 * @version: 1.0.0$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "员工表")
public class Employee implements Serializable {

    @NotNull
    @ApiModelProperty(value = "员工编号")
    private Integer id;

    @NotNull
    @ApiModelProperty(value = "员工年龄")
    private Integer age;

    @NotNull
    @ApiModelProperty(value = "员工姓名")
    private String name;

    @DecimalMax(value = "1")
    @DecimalMin(value = "0")
    @NotNull
    @ApiModelProperty(value = "员工性别 1=男 0=女")
    private Integer sex;

    @NotNull
    @ApiModelProperty(value = "员工地址")
    private String address;


}
