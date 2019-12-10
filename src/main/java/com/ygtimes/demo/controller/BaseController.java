package com.ygtimes.demo.controller;

import com.ygtimes.demo.Util.JsonResult;
import com.ygtimes.demo.service.ex.NotFountException;
import com.ygtimes.demo.service.ex.SelectException;
import com.ygtimes.demo.service.ex.ServiceException;
import com.ygtimes.demo.service.ex.UsernameDuplicateException;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 控制器类基类
 * @author
 * @date 2019/12/9 - 22:01
 */
public abstract class BaseController {
    /**
     * 响应状态：成功
     */
    protected static final int OK =2000;

    @ExceptionHandler({ServiceException.class})
    public JsonResult<Void> handleException(Throwable e){
        JsonResult<Void> jr = new JsonResult<>(e);
        if(e instanceof UsernameDuplicateException){
            jr.setState(4000);
        }else if (e instanceof NotFountException){
            jr.setState(4001);
        }else if(e instanceof SelectException){
            jr.setState(4002);
        }
        return jr;
    }
}
