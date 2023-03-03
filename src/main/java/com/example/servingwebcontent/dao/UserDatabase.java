package com.example.servingwebcontent.dao;

import com.example.servingwebcontent.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserDatabase implements UserDao {
    private static List<User> arrayUsers = new ArrayList<>();
    @Override
    public int insertUser(UUID id, User entryUser) {
        arrayUsers.add(new User(id, entryUser.getFirst_name(), entryUser.getLast_name(), entryUser.getAge()));
        return 1;
    }

    @Override
    public List<User> findAllUsers() {
        return arrayUsers;
    }

    @Override
    public Optional<User> findByIdUser(UUID id) {
        return arrayUsers.stream()
                .filter((userItem) -> userItem.getId().equals(id))
                .findFirst();
    }
}
