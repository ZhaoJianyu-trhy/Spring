package com.zjy.dao;

import com.zjy.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {

    List<User> selectUser();
}
