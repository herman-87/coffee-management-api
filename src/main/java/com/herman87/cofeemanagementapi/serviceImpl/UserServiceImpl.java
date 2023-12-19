package com.herman87.cofeemanagementapi.serviceImpl;

import com.herman87.cofeemanagementapi.domain.User;
import com.herman87.cofeemanagementapi.dto.UserDTO;
import com.herman87.cofeemanagementapi.repository.UserRepository;
import com.herman87.cofeemanagementapi.service.UserService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    @Transactional
    public String signUp(UserDTO userDTO) {
        log.info("Inside signUp {}", userDTO);
        if (!userRepository.existsByEmail(userDTO.getEmail())) {

            User user = User.builder()
                    .email(userDTO.getEmail())
                    .phone(userDTO.getPhone())
                    .name(userDTO.getName())
                    .password(userDTO.getPassword())
                    .build();
            User savedUser = userRepository.save(user);
            return savedUser.getId().toString();
        } else {
            return "Email already exist";
        }
    }
}
