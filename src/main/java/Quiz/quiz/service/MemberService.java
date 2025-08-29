package Quiz.quiz.service;

import Quiz.quiz.entity.Member;
import Quiz.quiz.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member registerMember(Member member){
        return memberRepository.save(member);
    }

    public Optional<Member> findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

    public boolean login(String email, String password) {
        Optional<Member> member = memberRepository.findByEmail(email);
        return member.isPresent() && member.get().getPassword().equals(password);
    }

    public void deleteMember(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}
