package hello.jpa.domain.delivery;

import hello.jpa.domain.member.Member;

import jakarta.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private Member sender;
//    private Member receiver;
}
