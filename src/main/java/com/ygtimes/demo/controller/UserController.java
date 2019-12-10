package com.ygtimes.demo.controller;

/**
 * @author
 * @date 2019/12/9 - 20:58
 */

import com.fasterxml.jackson.databind.ser.Serializers;
import com.ygtimes.demo.Util.JsonResult;
import com.ygtimes.demo.entity.User;
import com.ygtimes.demo.service.IUserServelt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    private IUserServelt userServelt;

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("reg")
    public JsonResult<Void> reg(User user){
        userServelt.put(user);
        return new JsonResult<>(OK);
    }
    @PostMapping("login")
    public JsonResult<User> login(User user){
        User result = userServelt.login(user);
        return new JsonResult<>(OK,result);
    }
}
