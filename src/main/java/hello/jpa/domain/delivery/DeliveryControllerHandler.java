package hello.jpa.domain.delivery;

import hello.jpa.domain.ControllerHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeliveryControllerHandler implements ControllerHandler {

    private final DeliveryController deliveryController;

    @Override
    public void handle(String cmd, String[] args) {
    }
}
