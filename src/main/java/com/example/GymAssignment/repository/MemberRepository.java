package com.example.GymAssignment.repository;

import com.example.GymAssignment.model.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MemberRepository {

    HashMap<Integer, Member> memberDb = new HashMap<>();
    public void addMember(Member member)
    {
        memberDb.put(member.getMemberId(), member);
    }

    public List<Member> getAllMembers()
    {
        List<Member> list = new ArrayList<>();
        for(int key : memberDb.keySet())
        {
            list.add(memberDb.get(key));
        }
        return list;
    }
}
