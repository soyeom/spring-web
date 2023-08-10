package hello.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import hello.hellospring.service.MemberService;

@Controller
public class MemberController {

    //새로 객체를 생성할 이유가 없음
    private final MemberService memberService;

    @Autowired //컨트롤러랑 서비스 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
