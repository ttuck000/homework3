package homework.domain;

import homework.domain.주문됨;
import homework.domain.주문취소함;
import homework.domain.배송확인함;
import homework.AppApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="주문_table")
@Data

public class 주문  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        homework.external.결제이력 결제이력 = new homework.external.결제이력();
        // mappings goes here
        AppApplication.applicationContext.getBean(homework.external.결제이력Service.class)
            .결제(결제이력);


        주문됨 주문됨 = new 주문됨(this);
        주문됨.publishAfterCommit();



        주문취소함 주문취소함 = new 주문취소함(this);
        주문취소함.publishAfterCommit();



        배송확인함 배송확인함 = new 배송확인함(this);
        배송확인함.publishAfterCommit();

    }

    public static 주문Repository repository(){
        주문Repository 주문Repository = AppApplication.applicationContext.getBean(주문Repository.class);
        return 주문Repository;
    }




    public static void 주문상태변경(배송시작됨 배송시작됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(배송시작됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 주문상태변경(배달취소됨 배달취소됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(배달취소됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 주문상태변경(요리시작됨 요리시작됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(요리시작됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }
    public static void 주문상태변경(요리완료됨 요리완료됨){

        /** Example 1:  new item 
        주문 주문 = new 주문();
        repository().save(주문);

        */

        /** Example 2:  finding and process
        
        repository().findById(요리완료됨.get???()).ifPresent(주문->{
            
            주문 // do something
            repository().save(주문);


         });
        */

        
    }


}
