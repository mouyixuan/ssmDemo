package com.uppower.exception;

import cn.windyrjc.utils.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;


/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/2 21:03
 * @description：异常处理器
 * @modified By：
 * @version: $
 */
@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

    @ResponseBody
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ExceptionHandler(MyException.class)
    public Response handleException(Exception e){
        log.error(e.getMessage());
        Response response = Response.fail(e.getMessage());
        return response;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Response exceptionHandler(HttpServletRequest request, Exception exception) {
        log.error(exception.getMessage());
        return Response.fail("服务器忙碌");
    }
}
