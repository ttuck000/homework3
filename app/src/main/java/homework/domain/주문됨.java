package homework.domain;

import homework.domain.*;
import homework.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class 주문됨 extends AbstractEvent {

    private Long orderid;
    private String address;
    private String customerid;
    private String productid;
    private Integer qty;
    private Date timestamp;
    private String customername;
    private String orderstatus;

    public 주문됨(주문 aggregate){
        super(aggregate);
    }
    public 주문됨(){
        super();
    }
}
