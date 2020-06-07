package com.zjy.service;

import com.zjy.dao.UserDao;
import com.zjy.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    //利用set进行动态实现


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void getUser() {
        userDao.getUser();
    }
}

