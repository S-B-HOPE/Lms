package com.student.lms.lms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.student.lms.lms.entity.Trainer;
import com.student.lms.lms.repo.TrainerRepository;

import java.util.List;

@RestController
@RequestMapping("/trainer")
@RequiredArgsConstructor
public class TrainerController {

    private final TrainerRepository trainerRepository;

    @GetMapping
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }
}

