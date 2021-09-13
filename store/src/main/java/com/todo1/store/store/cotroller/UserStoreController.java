package com.todo1.store.store.cotroller;

import java.util.List;

import com.todo1.store.store.dao.UserStoreDao;
import com.todo1.store.store.model.UserStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserStoreController {
    
    @Autowired
    private UserStoreDao userStoreDao;

    @RequestMapping(value = "api/users")
    public List<UserStore> getUsers() {
        return userStoreDao.getUsers();
    }

}
