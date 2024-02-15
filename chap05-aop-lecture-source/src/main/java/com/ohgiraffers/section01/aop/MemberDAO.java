package com.ohgiraffers.section01.aop;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberDAO {

    private final List<MemberDTO> memberList;

    public MemberDAO(){
        memberList = new ArrayList<>();
        memberList.add(new MemberDTO(1L,"유관순"));
        memberList.add(new MemberDTO(2L,"홍길동"));
    }

    public List<MemberDTO> selectAllMembers() {
        return memberList;
    }

    public MemberDTO selectMemberBy(long id) {
        return memberList.get((int)id);
    }
}
