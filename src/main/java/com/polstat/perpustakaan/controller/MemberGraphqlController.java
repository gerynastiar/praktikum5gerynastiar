package com.polstat.perpustakaan.controller;

import com.polstat.perpustakaan.dto.BookDto;
import com.polstat.perpustakaan.dto.MemberDto;
import com.polstat.perpustakaan.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MemberGraphqlController {

    @Autowired
    private MemberService memberService;

    @QueryMapping
    public List<MemberDto> members() {
        return memberService.getMembers();
    }

    @QueryMapping
    public MemberDto memberById(@Argument Long id) {
        return memberService.getMember(id);
    }

    @MutationMapping
    public MemberDto createMember(@Argument String name, @Argument String address, @Argument String phoneNumber, @Argument String memberID) {
        MemberDto memberDto = MemberDto.builder()
                .name(name)
                .address(address)
                .phoneNumber(phoneNumber)
                .memberID(memberID)
                .build();
        return memberService.createMember(memberDto);
    }

    @MutationMapping
    public MemberDto updateMember(@Argument Long id, @Argument String name, @Argument String address, @Argument String phoneNumber, @Argument String memberID) {
        MemberDto memberDto = memberService.getMember(id);
        memberDto.setName(name);
        memberDto.setMemberID(memberID);
        memberDto.setAddress(address);
        memberDto.setPhoneNumber(phoneNumber);
        return memberService.updateMember(memberDto);
    }

    @MutationMapping
    public void deleteMember(@Argument Long id) {
        MemberDto memberDto = memberService.getMember(id);
        memberService.deleteMember(memberDto);
    }
}
