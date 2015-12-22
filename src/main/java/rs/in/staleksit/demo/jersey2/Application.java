package rs.in.staleksit.demo.jersey2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:org/jtransfo/spring/jTransfoContext.xml"})
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
