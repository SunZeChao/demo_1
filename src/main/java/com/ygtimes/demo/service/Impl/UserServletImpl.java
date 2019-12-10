package com.ygtimes.demo.service.Impl;

import com.ygtimes.demo.entity.User;
import com.ygtimes.demo.mapper.UserMapper;
import com.ygtimes.demo.service.IUserServelt;
import com.ygtimes.demo.service.ex.NotFountException;
import com.ygtimes.demo.service.ex.SelectException;
import com.ygtimes.demo.service.ex.UsernameDuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.JobOriginatingUserName;

/**
 * 用户相关控制器
 * @author
 * @date 2019/12/9 - 19:03
 */
@Service
public class UserServletImpl implements IUserServelt {
    @Autowired(required = false)
    private UserMapper userMapper;

    /**
     * 用户注册
     * @param user
     */
    @Override
    public void put(User user) {
        String username = user.getUsername();
        User result = userMapper.select(username);
        if (result!=null) {
            throw new UsernameDuplicateException("用户名已存在");
        }
        Integer rows=userMapper.insert(user);
        if (rows!=1){
            throw new SelectException("出现未知错误，请联系管理员");
        }

    }

    /**
     *  用户登录
     * @param user 登录的用户信息
     * @return 返回数据库中的用户信息
     */
    @Override
    public User login(User user) {
        String username=user.getUsername();

        String password = user.getPassword();
        User result = userMapper.findByPassword(username,password);
        if(result==null){
            throw new NotFountException("用户或密码错误请重新输入");
        }
        return result;
    }
}
