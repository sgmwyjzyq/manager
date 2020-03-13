package com.sgm.service;

import com.sgm.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author SGM
 * @Date 2020/3/12 10:35
 * @Version V1.0
 */
public interface UserService {
    void addUser(User user);
}
