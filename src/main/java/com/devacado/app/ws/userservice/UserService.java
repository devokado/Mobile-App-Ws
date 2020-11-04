package com.devacado.app.ws.userservice;

import com.devacado.app.ws.ui.model.request.UserDetailsRequestModel;
import com.devacado.app.ws.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
