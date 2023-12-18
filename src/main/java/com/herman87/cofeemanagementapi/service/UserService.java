package com.herman87.cofeemanagementapi.service;

import com.herman87.cofeemanagementapi.dto.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService {
    String signUp(UserDTO userDTO);
}
