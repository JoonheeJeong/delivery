package hello.jpa.domain.member;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "member")
@ToString
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String name;
    @Embedded
    private Address addr;

    public Member(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }
}
