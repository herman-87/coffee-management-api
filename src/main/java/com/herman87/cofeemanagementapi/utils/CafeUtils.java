package com.herman87.cofeemanagementapi.utils;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@NoArgsConstructor
public class CafeUtils {

    public static ResponseEntity<String> getResponseEntity(String message, HttpStatus httpStatus) {
        return new ResponseEntity<>(
                "{ 'message' : "+ message +" }",
                httpStatus
        );
    }
}
