package com.dianping.dao;

import com.dianping.data.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TODO: 类描述
 * xiaodong.chen@meituan.com
 * 2017/7/24
 */
public interface UserDao {
    public User selectUser(User user);
    public void insertUser(User user);
    public void insertUserAuto(User use);
//    参数名称必须为list
    public void batchInsertUser(@Param("list") List<User> users);
    public void updateUser(User user);
    public void deleteUser(int userId);
    public List<User> selectUserLsit();
}
