
package com.loan.loanapproval.controller;

import com.loan.loanapproval.model.User;
import com.loan.loanapproval.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {
    @Autowired private AuthService authService;
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return authService.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return authService.login(user);
    }
}

