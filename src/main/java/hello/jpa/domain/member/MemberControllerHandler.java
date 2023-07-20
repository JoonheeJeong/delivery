package hello.jpa.domain.member;

import hello.jpa.domain.ControllerHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberControllerHandler implements ControllerHandler {

    private final MemberController memberController;

    @Override
    public void handle(String cmd, String[] args) {
        if (cmd.equals("new"))
            memberController.create(args);
        else if (cmd.equals("find"))
            memberController.find(args[0]);
    }
}
