package hello.jpa;

import hello.jpa.domain.ControllerHandler;
import hello.jpa.domain.delivery.DeliveryControllerHandler;
import hello.jpa.domain.member.MemberControllerHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {

    // domain -> handler
    private final Map<String, ControllerHandler> handlerMap;

    public CommandHandler() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        String[] domains = new String[] {"member", "delivery"};

        handlerMap = new HashMap<>();
        handlerMap.put(domains[0], ac.getBean(MemberControllerHandler.class));
        handlerMap.put(domains[1], ac.getBean(DeliveryControllerHandler.class));
    }

    public void handlerCommand(Map<String, Object> commandModel) {
        String cmd = (String) commandModel.get("cmd");
        String domain = (String) commandModel.get("domain");
        String[] args = (String[]) commandModel.get("args");

        ControllerHandler controllerHandler = handlerMap.get(domain);
        controllerHandler.handle(cmd, args);
    }
}
