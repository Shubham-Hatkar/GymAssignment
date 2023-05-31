package com.example.GymAssignment.controller;

import com.example.GymAssignment.model.Gym;
import com.example.GymAssignment.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class GymController
{
    @Autowired
    GymService gymService;

    @PostMapping("/add")
    public void addGym(@RequestBody Gym gym)
    {
        gymService.addGym(gym);
    }

    @GetMapping("/findgymwithmostmembers")
    public Gym findGymWithMostMembers()
    {
        return gymService.findGymWithMostMembers();
    }
}
