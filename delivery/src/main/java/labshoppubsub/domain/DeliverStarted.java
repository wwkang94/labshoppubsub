package labshoppubsub.domain;

import java.time.LocalDate;
import java.util.*;
import labshoppubsub.domain.*;
import labshoppubsub.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliverStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long productId;
    private Integer qty;
    private String status;

    public DeliverStarted(Delivery aggregate) {
        super(aggregate);
    }

    public DeliverStarted() {
        super();
    }
}
//>>> DDD / Domain Event
