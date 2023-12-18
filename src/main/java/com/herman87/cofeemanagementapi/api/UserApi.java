package com.herman87.cofeemanagementapi.api;

import com.herman87.cofeemanagementapi.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/user")
public interface UserApi {
    @PostMapping(path = "/sign-up")
    public ResponseEntity<String> signUp(@RequestBody(required = true)UserDTO userDTO);
}
