package hello.jpa.domain.member;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public Member save(Member member) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(member);
        et.commit();
        return member;
    }

    public Member findById(Long id) {
        return em.find(Member.class, id);
    }
}
