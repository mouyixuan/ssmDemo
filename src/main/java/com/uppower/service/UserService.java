package com.uppower.service;


import cn.windyrjc.utils.response.Response;
import com.uppower.dao.UserDao;
import com.uppower.domain.User;
import com.uppower.exception.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/7/1 13:12
 * @description：业务层
 * @modified By：
 * @version: 1.0.0$
 */
@Service
public class UserService {

    @Autowired
    private UserDao employeeDao;

    public Response userlogin(User user){

        String userPwd = employeeDao.findUserPwd(user.getAno());
        if (null==userPwd){
            throw new MyException("用户名不存在");
//            return Response.fail("用户名不存在");
        }
//        System.out.println(userPwd);
        if (userPwd.equals(user.getApassword())){
            return Response.success();
        }
        return Response.fail("密码错误");
    }
}
