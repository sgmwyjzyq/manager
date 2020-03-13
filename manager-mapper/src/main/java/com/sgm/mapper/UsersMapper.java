package com.sgm.mapper;

import com.sgm.pojo.User;

import java.util.List;

/**
 * @Description:
 * @Author SGM
 * @Date 2020/3/12 10:30
 * @Version V1.0
 */
public interface UsersMapper {

    void insertUser(User user);
    List<User> selectUserAll();
}
