package com.student.lms.lms.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.student.lms.lms.entity.Admin;
import com.student.lms.lms.repo.AdminRepository;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String signup(Admin admin) {
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        admin.setVerified(true); // auto-verify so login works immediately
        adminRepository.save(admin);
        return "Signup successful.";
    }

    @Override
    public String verifyAdmin(String email) {
        Admin admin = adminRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Admin not found"));

        admin.setVerified(true);
        adminRepository.save(admin);
        return "Admin verified successfully.";
    }

    @Override
    public String login(String email, String password) {
        Admin admin = adminRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Admin not found"));

        if (!admin.isVerified()) {
            throw new RuntimeException("Admin not verified");
        }

        if (!passwordEncoder.matches(password, admin.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        return "Login Successful";
    }
}