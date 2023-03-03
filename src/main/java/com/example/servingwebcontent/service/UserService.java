package com.example.servingwebcontent.service;

import com.example.servingwebcontent.dao.UserDao;
import com.example.servingwebcontent.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserDao userDao;
    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User userEntry) {
        return userDao.insertUser(userEntry);
    }

    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }

    public Optional<User> findByIdUser(UUID id) {
        return userDao.findByIdUser(id);
    }
}
