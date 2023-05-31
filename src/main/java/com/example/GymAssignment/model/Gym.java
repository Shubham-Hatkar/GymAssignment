package com.example.GymAssignment.model;

import java.util.List;

public class Gym
{
    private int gymId;
    private String location;
    private List<Member> memberList;
    private List<Trainer> trainerList;

    public Gym() {
    }

    public Gym(int gymId, String location, List<Member> memberList, List<Trainer> trainerList) {
        this.gymId = gymId;
        this.location = location;
        this.memberList = memberList;
        this.trainerList = trainerList;
    }

    public int getGymId() {
        return gymId;
    }

    public void setGymId(int gymId) {
        this.gymId = gymId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }
}
