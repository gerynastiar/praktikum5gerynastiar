/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polstat.perpustakaan.mapper;

/**
 *
 * @author asus
 */
import com.polstat.perpustakaan.dto.MemberDto;
import com.polstat.perpustakaan.entity.Member;

public class MemberMapper {
    public static Member mapToMember(MemberDto memberDto){
        return Member.builder()
            .id(memberDto.getId())
            .name(memberDto.getName())
            .memberID(memberDto.getMemberID())
            .address(memberDto.getAddress())
            .phoneNumber(memberDto.getPhoneNumber())
            .build();
    }
    public static MemberDto mapToMemberDto(Member member){
        return MemberDto.builder()
            .id(member.getId())
            .name(member.getName())
            .memberID(member.getMemberID())
            .address(member.getAddress())
            .phoneNumber(member.getPhoneNumber())
            .build();
    }
}
