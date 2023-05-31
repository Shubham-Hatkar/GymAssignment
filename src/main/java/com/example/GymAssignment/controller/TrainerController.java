package com.example.GymAssignment.controller;


import com.example.GymAssignment.model.Trainer;
import com.example.GymAssignment.repository.TrainerRepository;
import com.example.GymAssignment.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
    @Autowired
    TrainerService trainerService;

    @PostMapping("/add")
    public void addTrainer(@RequestBody Trainer trainer)
    {
        trainerService.addTrainer(trainer);
    }
}
