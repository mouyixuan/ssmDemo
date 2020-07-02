package com.uppower.dao;

import com.uppower.domain.Employee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/7/2 9:59
 * @description：
 * @modified By：
 * @version: $
 */
@Repository
public interface EmployeeDao {

    /**
     * @Description 查询所有员工信息
     **/
    @Select("select * from employee")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "age",  column = "age"),
            @Result(property = "name",  column = "name"),
            @Result(property = "sex",  column = "sex"),
            @Result(property = "address",  column = "address"),
    })
    Collection<Employee> findAll();

    /**
     * @Description 查询某员工信息
     **/
    @Select("select * from employee where id=#{id}")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "age",  column = "age"),
            @Result(property = "name",  column = "name"),
            @Result(property = "sex",  column = "sex"),
            @Result(property = "address",  column = "address"),
    })
    Employee findOne(int id);

    /**
     * @Description 添加员工信息
     **/
    @Insert("insert into employee value(#{id},#{age},#{name},#{sex},#{address})")
    boolean addOne(Employee employee);

    /**
     * @Description 删除员工信息
     **/
    @Delete("delete from employee where id=#{id}")
    boolean deleteStudent(int id);

    /**
     * @Description 修改员工信息
     **/
    @Update("update employee set age=#{age},name=#{name},sex=#{sex},address=#{address} where id=#{id}")
    boolean updateStudent(Employee employee);

}
