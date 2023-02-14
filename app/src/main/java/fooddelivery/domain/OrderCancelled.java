package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderCancelled extends AbstractEvent {

    private Long id;
}
