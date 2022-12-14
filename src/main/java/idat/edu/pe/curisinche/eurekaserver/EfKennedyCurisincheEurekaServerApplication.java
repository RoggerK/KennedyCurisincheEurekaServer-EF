package idat.edu.pe.curisinche.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfKennedyCurisincheEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfKennedyCurisincheEurekaServerApplication.class, args);
	}

}
