package homework.domain;

import homework.domain.요리시작됨;
import homework.domain.요리완료됨;
import homework.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="주문관리_table")
@Data

public class 주문관리  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        요리시작됨 요리시작됨 = new 요리시작됨(this);
        요리시작됨.publishAfterCommit();



        요리완료됨 요리완료됨 = new 요리완료됨(this);
        요리완료됨.publishAfterCommit();

    }

    public static 주문관리Repository repository(){
        주문관리Repository 주문관리Repository = StoreApplication.applicationContext.getBean(주문관리Repository.class);
        return 주문관리Repository;
    }




    public static void 주문정보받음(주문됨 주문됨){

        /** Example 1:  new item 
        주문관리 주문관리 = new 주문관리();
        repository().save(주문관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문됨.get???()).ifPresent(주문관리->{
            
            주문관리 // do something
            repository().save(주문관리);


         });
        */

        
    }
    public static void 주문취소관리(결제취소됨 결제취소됨){

        /** Example 1:  new item 
        주문관리 주문관리 = new 주문관리();
        repository().save(주문관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(결제취소됨.get???()).ifPresent(주문관리->{
            
            주문관리 // do something
            repository().save(주문관리);


         });
        */

        
    }
    public static void 주문취소관리(주문취소함 주문취소함){

        /** Example 1:  new item 
        주문관리 주문관리 = new 주문관리();
        repository().save(주문관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(주문취소함.get???()).ifPresent(주문관리->{
            
            주문관리 // do something
            repository().save(주문관리);


         });
        */

        
    }


}
