package com.bc.ebiz.user.service.user;

import com.bc.ebiz.user.persist.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-10
 * Time:  下午 3:20.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    User findById(int id);
}
