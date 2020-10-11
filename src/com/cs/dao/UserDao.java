package com.cs.dao;

import com.cs.entity.User;

import java.util.List;

public interface UserDao {

    //查询数据的总记录数
    public int findByCountUser()throws Exception;

    //分页方法
    public List<User> findByPageUserInfo(int pageNo, int pageSize) throws Exception;

    public User findByIDUserInfo(int id)throws Exception;

    public int updateUser(User us) throws Exception;

    public int del(int id) throws Exception;

    public int addUser(User us) throws Exception;
}
