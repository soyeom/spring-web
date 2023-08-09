package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    //null을 처리하는 방법으로, Optional로 감싸서 처리하는 방법이 있다.
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);

    //모든 회원 리스트 반환
    List<Member> findAll();
}