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
    @Autowired 주문관리Repository 주문관리Repository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문됨'")
    public void whenever주문됨_주문정보받음(@Payload 주문됨 주문됨){

        주문됨 event = 주문됨;
        System.out.println("\n\n##### listener 주문정보받음 : " + 주문됨 + "\n\n");


        

        // Sample Logic //
        주문관리.주문정보받음(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='결제취소됨'")
    public void whenever결제취소됨_주문취소관리(@Payload 결제취소됨 결제취소됨){

        결제취소됨 event = 결제취소됨;
        System.out.println("\n\n##### listener 주문취소관리 : " + 결제취소됨 + "\n\n");


        

        // Sample Logic //
        주문관리.주문취소관리(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문취소함'")
    public void whenever주문취소함_주문취소관리(@Payload 주문취소함 주문취소함){

        주문취소함 event = 주문취소함;
        System.out.println("\n\n##### listener 주문취소관리 : " + 주문취소함 + "\n\n");


        

        // Sample Logic //
        주문관리.주문취소관리(event);
        

        

    }

}


