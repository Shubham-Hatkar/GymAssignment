package com.example.GymAssignment.service;

import com.example.GymAssignment.controller.MemberController;
import com.example.GymAssignment.model.Member;
import com.example.GymAssignment.model.Trainer;
import com.example.GymAssignment.repository.MemberRepository;
import com.example.GymAssignment.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    TrainerRepository trainerRepository;

    public void addMember(Member member)
    {
        memberRepository.addMember(member);
    }

    public Member memberTrainedByMostTrainers()
    {
        List<Member> memberList = memberRepository.getAllMembers();

        int count = 0;
        Member memberans = null;
        for(Member member : memberList)
        {
            if(count < member.getTrainerList().size())
            {
                count = member.getTrainerList().size();
                memberans = member;
            }
        }
        return memberans;
    }

    public int getMemberTrainedByTrainerWorkingInMultipleGym()
    {
        // get the memberlist and iterate
        List<Member> memberList = memberRepository.getAllMembers();

        int count = 0;
        for(Member member : memberList)
        {
            // get the trainer list
            List<Trainer> trainerList = member.getTrainerList();
            // iterate over trainers and get the size of list of gyms where he is giving training
            for(Trainer trainer : trainerList)
            {
                if(trainer.getGymListWhereTrainerIsGivingTraining().size() > 1)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
