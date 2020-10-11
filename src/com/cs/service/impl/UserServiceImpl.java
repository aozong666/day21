package com.cs.service.impl;

import com.cs.dao.impl.UserDaoImpl;
import com.cs.entity.User;
import com.cs.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDaoImpl udi=new UserDaoImpl();
    @Override
    public int findByCountUser() throws Exception {
        return udi.findByCountUser();
    }

    @Override
    public List<User> findByPageUserInfo(int pageNo, int pageSize) throws Exception {
        return udi.findByPageUserInfo(pageNo,pageSize);
    }

    @Override
    public User findByIDUserInfo(int id) throws Exception {
        return udi.findByIDUserInfo(id);
    }

    @Override
    public boolean updateUser(User us) throws Exception {
        int i = udi.updateUser(us);
        if(i>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean del(int id) throws Exception {
        int i = udi.del(id);
        if(i>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean addUser(User us) throws Exception {
        int i = udi.addUser(us);
        if(i>0){
            return true;
        }else{
            return false;
        }
    }
}
