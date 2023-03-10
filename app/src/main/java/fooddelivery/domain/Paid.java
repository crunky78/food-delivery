package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Paid extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long price;
    private String action;
}
