package com.student.lms.lms.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.student.lms.lms.entity.Admin;
import com.student.lms.lms.service.AdminService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class AuthController {

    private final AdminService adminService;

    // Works with HTML form (application/x-www-form-urlencoded)
    @PostMapping("/signup")
    public String signup(Admin admin) {
        return adminService.signup(admin);
    }

    @PostMapping("/verify-admin")
    public String verify(@RequestParam String email) {
        return adminService.verifyAdmin(email);
    }

    // Works with HTML form (application/x-www-form-urlencoded)
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {
        return adminService.login(email, password);
    }
}