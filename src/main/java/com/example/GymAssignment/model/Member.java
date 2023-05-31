package com.example.GymAssignment.model;

import java.util.List;

public class Member
{
    private int memberId;
    private List<Trainer> trainerList;
    private int gymId;

    public Member(int memberId, List<Trainer> trainerList, int gymId) {
        this.memberId = memberId;
        this.trainerList = trainerList;
        this.gymId = gymId;
    }

    public Member() {
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }
}
