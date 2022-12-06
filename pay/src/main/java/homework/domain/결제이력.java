package homework.domain;

import homework.domain.결제승인됨;
import homework.domain.결제취소됨;
import homework.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="결제이력_table")
@Data

public class 결제이력  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        결제승인됨 결제승인됨 = new 결제승인됨(this);
        결제승인됨.publishAfterCommit();



        결제취소됨 결제취소됨 = new 결제취소됨(this);
        결제취소됨.publishAfterCommit();

    }

    public static 결제이력Repository repository(){
        결제이력Repository 결제이력Repository = PayApplication.applicationContext.getBean(결제이력Repository.class);
        return 결제이력Repository;
    }






}
