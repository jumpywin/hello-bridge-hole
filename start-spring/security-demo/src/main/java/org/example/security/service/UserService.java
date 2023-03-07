package org.example.security.service;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.security.entity.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService implements UserDetailsService {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return jdbcTemplate.queryForObject("select * from users where username = ?", new UserRowMapper(), username);
    }
}
