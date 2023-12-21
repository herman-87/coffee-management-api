package com.herman87.cofeemanagementapi.service;

import com.herman87.cofeemanagementapi.domain.User;
import com.herman87.cofeemanagementapi.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
@Getter
@RequiredArgsConstructor
public class CustomerUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private User userDetails;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Inside loadUserbyUsername {}", username);
        userDetails = userRepository.findByEmail(username).orElseThrow();

        return new org.springframework.security.core.userdetails.User(
                userDetails.getEmail(),
                userDetails.getPassword(),
                new ArrayList<>()
        );
    }
}
