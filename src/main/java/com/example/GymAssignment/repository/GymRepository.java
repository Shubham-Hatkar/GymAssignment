package com.example.GymAssignment.repository;

import com.example.GymAssignment.model.Gym;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class GymRepository {

    HashMap<Integer, Gym> gymDb = new HashMap<>(); // gymId : gym Obj.
    public void addGym(Gym gym)
    {
        gymDb.put(gym.getGymId(), gym);
    }

    public Gym findGymWithMostMembers()
    {
        int count  = 0;
        Gym gymans = null;
        for(int key : gymDb.keySet())
        {
            Gym currGym = gymDb.get(key);
            if(count < currGym.getMemberList().size())
            {
                count = currGym.getMemberList().size();
                gymans = currGym;
            }
        }
        return gymans;
    }
}
