package com.herman87.cofeemanagementapi.security;

import com.herman87.cofeemanagementapi.service.CustomerUserDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final CustomerUserDetailsService customerUserDetailsService;


}
