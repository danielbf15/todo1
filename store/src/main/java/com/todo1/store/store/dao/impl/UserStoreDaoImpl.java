package com.todo1.store.store.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.todo1.store.store.dao.UserStoreDao;
import com.todo1.store.store.model.UserStore;

public class UserStoreDaoImpl implements UserStoreDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserStore> getUsers() {
        return entityManager.createQuery("FROM UserStore").getResultList();
    }

    @Override
    public UserStore getUser(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserStore getUser(String email) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserStore saveUser(UserStore user) {
        // TODO Auto-generated method stub
        return user;
    }
    
}
