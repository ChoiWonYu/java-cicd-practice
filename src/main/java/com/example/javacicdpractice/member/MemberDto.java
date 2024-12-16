package com.example.javacicdpractice.member;

public record MemberDto(Long id, String name) {

    public static MemberDto toDto(final Member member) {
        return new MemberDto(member.getId(), member.getName());
    }
}
