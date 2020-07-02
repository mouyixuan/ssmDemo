package com.uppower.service;

import cn.windyrjc.utils.response.Response;
import com.uppower.dao.EmployeeDao;
import com.uppower.domain.Employee;
import com.uppower.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/7/2 10:13
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeDao employeeDao;
    
    public Response findAllEmployee(){
        Collection<Employee> all = employeeDao.findAll();
        return Response.success(all);
    }

    public Response findAneEmployee(int id){
        Employee one = employeeDao.findOne(id);
        return Response.success(one);
    }

    public Response deleteEmployee(int id){
        boolean deleteStudent = employeeDao.deleteStudent(id);
        if (false==deleteStudent){
            throw new MyException("删除失败");
        }
        return Response.success();
    }

    @Transactional(rollbackFor = MyException.class)
    public Response addEmployee(Employee employee){
        boolean addOne = employeeDao.addOne(employee);
        if (false==addOne){
            throw new MyException("添加失败");
        }
        return Response.success();
    }

    @Transactional(rollbackFor = MyException.class)
    public Response changeEmployee(Employee employee){
        System.out.println(employee);
        boolean updateStudent = employeeDao.updateStudent(employee);
        if (false==updateStudent){
            throw new MyException("修改失败");
        }
        return Response.success();
    }
}
