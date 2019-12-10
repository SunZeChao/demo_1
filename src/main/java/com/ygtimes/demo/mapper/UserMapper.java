package com.ygtimes.demo.mapper;

import com.ygtimes.demo.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户注册登录业务层
 * @author
 * @date 2019/12/9 - 18:01
 */
public interface UserMapper {
    /**
     * 用户注册：查询用户是否存在
     * @param username 用户提交的用户名
     * @return 受影响的行数
     */
    User select(String username);

    /**
     * 用户注册：插入新用户
     * @param user 新用户对象
     * @return
     */
    Integer insert(User user);

    /**
     * 判断密码是否输入正确
     * @param password 用户密码
     * @return 受影响的用户
     */
    User findByPassword(@Param("username") String username,
                        @Param("password") String password);
}
