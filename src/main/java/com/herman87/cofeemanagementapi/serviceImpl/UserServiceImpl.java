package com.herman87.cofeemanagementapi.serviceImpl;

import com.herman87.cofeemanagementapi.constent.CafeConstants;
import com.herman87.cofeemanagementapi.domain.User;
import com.herman87.cofeemanagementapi.dto.UserDTO;
import com.herman87.cofeemanagementapi.repository.UserRepository;
import com.herman87.cofeemanagementapi.service.UserService;
import com.herman87.cofeemanagementapi.utils.CafeUtils;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    @Transactional
    public String signUp(UserDTO userDTO) {
        log.info("Inside signUp {}", userDTO);
            if (userRepository.exsistByEmail(userDTO.getEmail())) {

                User user = User.builder()
                        .email(userDTO.getEmail())
                        .phone(userDTO.getPhone())
                        .name(userDTO.getName())
                        .password(userDTO.getPassword())
                        .build();
                userRepository.save(user);

                return "Successfully Registered";
            } else {
                return "Email already exist";
            }
        }
    }
}
