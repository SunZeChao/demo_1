package com.ygtimes.demo.service;

import com.ygtimes.demo.entity.User;

/**
 * 业务层接口
 * @author
 * @date 2019/12/9 - 18:33
 */
public interface IUserServelt {
    /**
     * 插入新用户
     * @param user
     * @return 新用户对象
     */
    void put(User user);

    User login(User user);
}
