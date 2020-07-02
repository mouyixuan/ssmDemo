package com.uppower.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/7/1 12:56
 * @description：User
 * @modified By：
 * @version: 1.0.0$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "用户")
public class User implements Serializable {

    @ApiModelProperty(value = "账户")
    private String ano;

    @ApiModelProperty(value = "密码")
    private String apassword;

}
