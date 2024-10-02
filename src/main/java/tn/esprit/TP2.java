package tn.esprit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "tn.esprit.entities")
public class TP2 {

	public static void main(String[] args) {
		SpringApplication.run(TP2.class, args);
	}

}
