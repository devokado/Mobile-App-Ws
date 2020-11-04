package com.devacado.app.ws.userservice.impl;

import com.devacado.app.ws.shared.Utils;
import com.devacado.app.ws.ui.model.request.UserDetailsRequestModel;
import com.devacado.app.ws.ui.model.response.UserRest;
import com.devacado.app.ws.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    Map<String, UserRest> users;
    Utils utils;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());
        returnValue.setEmail(userDetails.getEmail());

        String userId = utils.generateUserId();
        returnValue.setUserId(userId);
        if (users == null) users = new HashMap<>();
        users.put(userId, returnValue);
        return returnValue;
    }
}
