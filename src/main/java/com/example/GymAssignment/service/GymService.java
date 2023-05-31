package com.example.GymAssignment.service;

import com.example.GymAssignment.model.Gym;
import com.example.GymAssignment.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymService {

    @Autowired
    GymRepository gymRepository;

    public void addGym(Gym gym)
    {
        gymRepository.addGym(gym);
    }

    public Gym findGymWithMostMembers()
    {
        return gymRepository.findGymWithMostMembers();
    }
}
