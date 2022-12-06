package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 결제승인됨 extends AbstractEvent {

    private Long id;
    private String paymentid;
    private String orderid;

    public 결제승인됨(결제이력 aggregate){
        super(aggregate);
    }
    public 결제승인됨(){
        super();
    }
}
