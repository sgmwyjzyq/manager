package com.sgm.test;

import com.sgm.mapper.UsersMapper;
import com.sgm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description:
 * @Author SGM
 * @Date 2020/3/12 10:51
 * @Version V1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        User user = new User();
        user.setUserCode("Test001");
        user.setUserName("test");
        user.setUserPassword("dsafgdagda");
        user.setUserState(1);

        usersMapper.insertUser(user);
    }

    @Test
    public void getUser(){

        List<User> userList = usersMapper.selectUserAll();
        for (User user : userList) {
            System.out.println(user.getUserCode());
        }
        System.out.println(usersMapper.selectUserAll().isEmpty());

    }
}
