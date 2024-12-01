package com.example.javacicdpractice.member;

public record MemberDto(String name) {

    public static MemberDto toDto(final Member member) {
        return new MemberDto(member.getName());
    }
}
