package com.jlco.auth_server.services;

import com.jlco.auth_server.dtos.TokenDto;
import com.jlco.auth_server.dtos.UserDto;

public interface AuthService {

    TokenDto login(UserDto user);
    TokenDto validateToken(TokenDto token);
}
