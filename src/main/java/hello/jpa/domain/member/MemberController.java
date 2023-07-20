package hello.jpa.domain.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    public Member create(String[] args) {
        Address addr = new Address(args[1], args[2], args[3], args[4]);
        log.info("create 전");
        Member member = memberRepository.save(new Member(args[0], addr));
        log.info("create 후");
        log.info("member: {}", member);
        return member;
    }

    public Member find(String id) {
        Member member = memberRepository.findById(Long.valueOf(id));
        log.info("member: {}", member);
        return member;
    }
}
