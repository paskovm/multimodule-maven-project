package com.metodipaskov;

import com.metodipaskov.domain.UserCommand;

public class UserController {

    User saveUser(UserCommand userCommand) {
        // fake impl
        return UserMapper.INSTANCE.userCommandToUser(userCommand);
    }
}
