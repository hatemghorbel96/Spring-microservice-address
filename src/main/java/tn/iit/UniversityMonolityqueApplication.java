package tn.iit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class UniversityMonolityqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityMonolityqueApplication.class, args);
	}

}
