package com.intrum.refinance;

import com.intrum.refinance.entity.Debt;
import com.intrum.refinance.entity.Debtor;
import com.intrum.refinance.entity.Payment;
import com.intrum.refinance.repo.DebtRepository;
import com.intrum.refinance.repo.DebtorRepository;
import com.intrum.refinance.repo.PaymentRepository;
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
	public CommandLineRunner initData(PaymentRepository paymentRepo, DebtRepository debtRepo, DebtorRepository debtorRepo){
		return args -> {
			Payment p1 = new Payment("23nb45hg", LocalDateTime.now(), 4234.2, "Office");
			Payment p2 = new Payment("s65g3458", LocalDateTime.now(), 1234.2, "INTERNET");

			Debt debt1 = new Debt(23.4, 13.5);
			Debt debt2 = new Debt(23.4, 13.5);

			debt1.addPayment(p1);
			debt1.addPayment(p2);

			Debtor debtor1 = new Debtor(
					2123D,
					2123D,
					2123D,
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					31,
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD",
					"SD"

			);
			Debtor debtor2 = new Debtor();

			debtor1.addDebt(debt1);
			debtor1.addDebt(debt2);

			debtorRepo.save(debtor2);
			debtorRepo.save(debtor1);

			debtRepo.save(debt1);
			debtRepo.save(debt2);

			paymentRepo.save(p1);
			paymentRepo.save(p2);

		};
	}
}