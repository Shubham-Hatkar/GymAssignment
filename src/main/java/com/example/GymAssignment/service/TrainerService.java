package com.example.GymAssignment.service;

import com.example.GymAssignment.model.Trainer;
import com.example.GymAssignment.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    @Autowired
    TrainerRepository trainerRepository;
    public void addTrainer(Trainer trainer)
    {
        trainerRepository.addTrainer(trainer);
    }
}
