package com.bc.ebiz.user.persist.mapper;

import com.bc.ebiz.user.persist.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: banchun
 * Date:  2017-05-10
 * Time:  下午 2:59.
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public interface UserMapper {


    User findById(int id);

}
