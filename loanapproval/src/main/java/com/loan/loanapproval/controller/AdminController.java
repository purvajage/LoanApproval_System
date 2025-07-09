// controller/AdminController.java
package com.loan.loanapproval.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {

    @GetMapping("/dashboard")
    public String adminPanel() {
        return "Welcome to the Admin Dashboard!";
    }
}
