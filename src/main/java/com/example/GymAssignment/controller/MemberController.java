package com.example.GymAssignment.controller;

import com.example.GymAssignment.model.Member;
import com.example.GymAssignment.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController
{
    @Autowired
    MemberService memberService;


    @PostMapping("/add")
    public void addMember(@RequestBody Member member)
    {
        memberService.addMember(member);
    }

    @GetMapping("/membertrainedbymosttrainer")
    public Member memberTrainedByMostTrainers()
    {
        return memberService.memberTrainedByMostTrainers();
    }

    @GetMapping("/trainerwithatleasttwogym")
    public int getMemberTrainedByTrainerWorkingInMultipleGym()
    {
        return memberService.getMemberTrainedByTrainerWorkingInMultipleGym();
    }
}
