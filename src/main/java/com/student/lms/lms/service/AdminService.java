package com.student.lms.lms.service;

import com.student.lms.lms.entity.Admin;

public interface AdminService {

    String signup(Admin admin);

    String verifyAdmin(String email);

    String login(String email, String password);
}