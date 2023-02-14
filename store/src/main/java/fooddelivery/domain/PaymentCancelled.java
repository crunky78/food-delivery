package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class PaymentCancelled extends AbstractEvent {

    private Long id;
    private Long orderId;
}
