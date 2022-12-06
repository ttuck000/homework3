package homework.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import homework.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import homework.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired 주문Repository 주문Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송시작됨'")
    public void whenever배송시작됨_주문상태변경(@Payload 배송시작됨 배송시작됨){

        배송시작됨 event = 배송시작됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 배송시작됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달취소됨'")
    public void whenever배달취소됨_주문상태변경(@Payload 배달취소됨 배달취소됨){

        배달취소됨 event = 배달취소됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 배달취소됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리시작됨'")
    public void whenever요리시작됨_주문상태변경(@Payload 요리시작됨 요리시작됨){

        요리시작됨 event = 요리시작됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 요리시작됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리완료됨'")
    public void whenever요리완료됨_주문상태변경(@Payload 요리완료됨 요리완료됨){

        요리완료됨 event = 요리완료됨;
        System.out.println("\n\n##### listener 주문상태변경 : " + 요리완료됨 + "\n\n");


        

        // Sample Logic //
        주문.주문상태변경(event);
        

        

    }

}


