package consumidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;




@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
public class AplicacionConsumidor {
    public static void main(String[] args) {
    	
        SpringApplication.run(AplicacionConsumidor.class, args);
    }
}
