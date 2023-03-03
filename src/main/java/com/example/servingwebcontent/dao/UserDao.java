package com.example.servingwebcontent.dao;

import com.example.servingwebcontent.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id, User entryUser);

    default int insertUser(User userEntry) {
        UUID id = UUID.randomUUID();
        return insertUser(id, userEntry);
    }

    List<User> findAllUsers();

    Optional<User> findByIdUser(UUID id);
}
