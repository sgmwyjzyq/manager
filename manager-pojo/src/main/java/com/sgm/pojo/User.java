package com.sgm.pojo;

/**
 * @Description:
 * @Author SGM
 * @Date 2020/3/12 10:27
 * @Version V1.0
 */
public class User {
    private String userCode;
    private String userName;
    private String userPassword;
    private int userState;

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
