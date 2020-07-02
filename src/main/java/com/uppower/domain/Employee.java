package com.uppower.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Employee {

    @ApiModelProperty(value = "员工编号")
    private int id;

    @ApiModelProperty(value = "员工年龄")
    private String age;

    @ApiModelProperty(value = "员工姓名")
    private String name;

    @ApiModelProperty(value = "员工性别 1=男 0=女")
    private int sex;

    @ApiModelProperty(value = "员工地址")
    private String address;


}
