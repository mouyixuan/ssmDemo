package com.uppower.controller;

import cn.windyrjc.utils.response.Response;
import com.uppower.domain.Employee;
import com.uppower.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/7/1 13:05
 * @description：
 * @modified By：
 * @version: 1.0.0$
 */
@RestController
@RequestMapping("/employee")
@Api("员工接口")
public class EmployeeController implements Serializable {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("")
    @ApiOperation("查询所有员工")
    public Response allEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    @ApiOperation("查询某员工")
    public Response oneEmployee(@PathVariable("id") int id){
        return employeeService.findAneEmployee(id);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除某员工")
    public Response delelteOneEmployee(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);
    }

    @PostMapping("")
    @ApiOperation("增加某员工")
    public Response addOneEmployee(@Valid Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PostMapping("/{id}")
    @ApiOperation("修改某员工")
    public Response changeOneEmployee(@PathVariable("id") int id,Employee employee){
        return employeeService.changeEmployee(employee);
    }
}
