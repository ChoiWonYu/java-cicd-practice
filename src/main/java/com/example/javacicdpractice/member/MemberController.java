package com.example.javacicdpractice.member;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping
    public List<MemberDto> test() {
        return memberRepository.findAll()
                               .stream()
                               .map(MemberDto::toDto)
                               .toList();
    }
}
