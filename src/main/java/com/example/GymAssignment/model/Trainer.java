package com.example.GymAssignment.model;

import java.util.List;

public class Trainer
{
    private int trainerId;
    private List<Member> memberList;
    private List<Gym> gymListWhereTrainerIsGivingTraining;

    public Trainer() {
    }

    public Trainer(int trainerId, List<Member> memberList, List<Gym> gymListWhereTrainerIsGivingTraining) {
        this.trainerId = trainerId;
        this.memberList = memberList;
        this.gymListWhereTrainerIsGivingTraining = gymListWhereTrainerIsGivingTraining;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Gym> getGymListWhereTrainerIsGivingTraining() {
        return gymListWhereTrainerIsGivingTraining;
    }

    public void setGymListWhereTrainerIsGivingTraining(List<Gym> gymListWhereTrainerIsGivingTraining) {
        this.gymListWhereTrainerIsGivingTraining = gymListWhereTrainerIsGivingTraining;
    }
}
