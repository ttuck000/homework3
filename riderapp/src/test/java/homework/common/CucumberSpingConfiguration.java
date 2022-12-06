package homework.common;


import homework.RiderappApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { RiderappApplication.class })
public class CucumberSpingConfiguration {
    
}
