package com.uppower.controller;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.User;
import com.uppower.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/7/2 7:33
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@RequestMapping("/user")
@Api("管理员接口")
public class UserController implements Serializable {
    @Autowired
    private UserService employeeService;

    @RequestMapping("/login")
    @ApiOperation("管理员用户登录")
    public Response login(@RequestParam("ano") String name,
                          @RequestParam("apassword") String passwrod){
        if (name.isEmpty()||passwrod.isEmpty()){
            return Response.fail("用户名或密码为空");
        }
        User user = new User(name, passwrod);
//        System.out.println(user);
        Response response = employeeService.userlogin(user);
        System.out.println(response);
        return response;
    }
}
