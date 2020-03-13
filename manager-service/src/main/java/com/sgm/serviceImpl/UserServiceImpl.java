package com.sgm.serviceImpl;

import com.sgm.mapper.UsersMapper;
import com.sgm.pojo.User;
import com.sgm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author SGM
 * @Date 2020/3/12 17:25
 * @Version V1.0
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    public UsersMapper usersMapper;

    public void addUser(User user) {
        this.usersMapper.insertUser(user);
    }
}
