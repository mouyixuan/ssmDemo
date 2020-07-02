package com.uppower.dao;

import com.uppower.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/7/1 13:06
 * @description：
 * @modified By：
 * @version: 1.0.0$
 */
@Repository
public interface UserDao {

    /**
     * @Description
     **/
    @Select("select apassword from user where ano=#{ano}")
    @Results({
            @Result(property = "apassword",  column = "apassword"),
    })
    public String findUserPwd(String ano);

}
