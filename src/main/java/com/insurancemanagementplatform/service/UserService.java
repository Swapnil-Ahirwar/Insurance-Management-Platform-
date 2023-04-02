package com.insurancemanagementplatform.service;

import com.insurancemanagementplatform.controller.UserApiController;
import com.insurancemanagementplatform.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User addUser(User user);

    User updateUser(User user);

    User getUserById(Long userId);

    void deleteUser(Long userId);
}
