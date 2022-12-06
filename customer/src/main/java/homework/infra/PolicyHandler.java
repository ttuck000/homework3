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
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문됨'")
    public void whenever주문됨_카톡알림처리(@Payload 주문됨 주문됨){

        주문됨 event = 주문됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 주문됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='결제승인됨'")
    public void whenever결제승인됨_카톡알림처리(@Payload 결제승인됨 결제승인됨){

        결제승인됨 event = 결제승인됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 결제승인됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달취소됨'")
    public void whenever배달취소됨_카톡알림처리(@Payload 배달취소됨 배달취소됨){

        배달취소됨 event = 배달취소됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 배달취소됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리시작됨'")
    public void whenever요리시작됨_카톡알림처리(@Payload 요리시작됨 요리시작됨){

        요리시작됨 event = 요리시작됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 요리시작됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='요리완료됨'")
    public void whenever요리완료됨_카톡알림처리(@Payload 요리완료됨 요리완료됨){

        요리완료됨 event = 요리완료됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 요리완료됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송시작됨'")
    public void whenever배송시작됨_카톡알림처리(@Payload 배송시작됨 배송시작됨){

        배송시작됨 event = 배송시작됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 배송시작됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='결제취소됨'")
    public void whenever결제취소됨_카톡알림처리(@Payload 결제취소됨 결제취소됨){

        결제취소됨 event = 결제취소됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 결제취소됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배송확인함'")
    public void whenever배송확인함_카톡알림처리(@Payload 배송확인함 배송확인함){

        배송확인함 event = 배송확인함;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 배송확인함 + "\n\n");


        

        // Sample Logic //

        

    }

}


