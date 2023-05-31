package com.example.GymAssignment.repository;

import com.example.GymAssignment.model.Trainer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class TrainerRepository {
    HashMap<Integer, Trainer> trainerDB = new HashMap<>();
    public void addTrainer(Trainer trainer)
    {
        trainerDB.put(trainer.getTrainerId(), trainer);
    }
}
