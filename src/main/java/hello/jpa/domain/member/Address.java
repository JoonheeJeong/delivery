package hello.jpa.domain.member;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Address {
    @NotEmpty
    private String si_do;
    @NotEmpty
    private String si_gun_gu;
    @NotEmpty
    private String road;
    @NotEmpty
    private String detail;
}
