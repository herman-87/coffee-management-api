package com.herman87.cofeemanagementapi.restImpl;

import com.herman87.cofeemanagementapi.constent.CafeConstants;
import com.herman87.cofeemanagementapi.rest.UserRest;
import com.herman87.cofeemanagementapi.service.UserService;
import com.herman87.cofeemanagementapi.utils.CafeUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class UserRestImpl implements UserRest {
    private final UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
            return userService.signUp(requestMap);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
