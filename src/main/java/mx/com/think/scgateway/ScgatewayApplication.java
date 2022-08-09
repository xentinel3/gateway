package mx.com.think.scgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScgatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScgatewayApplication.class, args);
    }

}
