// service/AuthService.java
package com.loan.loanapproval.service;

import com.loan.loanapproval.model.User;
import com.loan.loanapproval.repository.UserRepository;
import com.loan.loanapproval.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired private UserRepository userRepo;
    @Autowired private PasswordEncoder passwordEncoder;
    @Autowired private JwtUtil jwtUtil;

    public String register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return "User registered";
    }

    public String login(User user) {
        Optional<User> optional = userRepo.findByUsername(user.getUsername());
        if (optional.isPresent() && passwordEncoder.matches(user.getPassword(), optional.get().getPassword())) {
            return jwtUtil.generateToken(user.getUsername());
        }
        throw new RuntimeException("Invalid credentials");
    }
}
