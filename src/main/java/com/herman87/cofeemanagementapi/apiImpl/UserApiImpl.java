package com.herman87.cofeemanagementapi.apiImpl;

import com.herman87.cofeemanagementapi.api.UserApi;
import com.herman87.cofeemanagementapi.dto.UserDTO;
import com.herman87.cofeemanagementapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserApiImpl implements UserApi {
    private final UserService userService;

    @Override
    public ResponseEntity<String> signUp(UserDTO userDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.signUp(userDTO));
    }
}
