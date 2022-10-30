package com.hm.userservice.service;

import com.hm.userservice.dto.UserDto;
import com.hm.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
