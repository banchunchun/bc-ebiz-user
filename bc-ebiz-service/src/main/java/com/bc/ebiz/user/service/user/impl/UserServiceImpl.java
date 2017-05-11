package com.bc.ebiz.user.service.user.impl;

import com.bc.ebiz.user.persist.entity.User;
import com.bc.ebiz.user.persist.mapper.UserMapper;
import com.bc.ebiz.user.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-10
 * Time:  下午 3:21.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
