package homework.infra;

import homework.domain.*;
import homework.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class 통합주문상태ViewHandler {

    @Autowired
    private 통합주문상태Repository 통합주문상태Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void when주문됨_then_CREATE_1 (@Payload 주문됨 주문됨) {
        try {

            if (!주문됨.validate()) return;

            // view 객체 생성
            통합주문상태 통합주문상태 = new 통합주문상태();
            // view 객체에 이벤트의 Value 를 set 함
            통합주문상태.setOrderstatus(주문됨.getOrderstatus());
            통합주문상태.setOrderid(String.valueOf(주문됨.getOrderid()));
            // view 레파지 토리에 save
            통합주문상태Repository.save(통합주문상태);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void when주문됨_then_UPDATE_1(@Payload 주문됨 주문됨) {
        try {
            if (!주문됨.validate()) return;
                // view 객체 조회

                List<통합주문상태> 통합주문상태List = 통합주문상태Repository.findByOrderid(String.valueOf(주문됨.getId()));
                for(통합주문상태 통합주문상태 : 통합주문상태List){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    통합주문상태.setDeliverystatus("배송됨");
                // view 레파지 토리에 save
                통합주문상태Repository.save(통합주문상태);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

