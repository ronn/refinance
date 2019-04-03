package com.intrum.refinance;

import com.intrum.refinance.entity.Payment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class RefinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefinanceApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(){
		return args -> {
			Payment p1 = new Payment("23nb45hg", LocalDateTime.now(), 4234.2, "Office");
			Payment p2 = new Payment("s65g3458", LocalDateTime.now(), 1234.2, "INTERNET");

			//paymentRepo.save(p1);
			//paymentRepo.save(p2);
		};
	}
}