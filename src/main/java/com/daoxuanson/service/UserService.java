package com.daoxuanson.service;

import com.daoxuanson.model.response.UserResponse;

public interface UserService {
    UserResponse findUserByUserNameAndPassword(String userName, String password);
}
