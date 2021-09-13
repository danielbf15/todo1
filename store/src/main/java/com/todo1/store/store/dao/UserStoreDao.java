package com.todo1.store.store.dao;

import java.util.List;

import com.todo1.store.store.model.UserStore;

public interface UserStoreDao {

    public List<UserStore> getUsers();

    public UserStore getUser(Long id);

    public UserStore getUser(String email);

    public UserStore saveUser(UserStore user);
    
}
