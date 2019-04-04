package com.intrum.refinance;

import com.intrum.refinance.entity.Calculation;
import com.intrum.refinance.entity.Debtor;
import com.intrum.refinance.repo.DebtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RefinanceController {

    @Autowired
    private DebtorRepository debtorRepo;

    @RequestMapping("/debtors")
    public List<Debtor> findAll(){
        return debtorRepo.findAll();
    }

    @RequestMapping("/calculate")
    public HashMap<String, Boolean> isFeasible(@RequestBody Calculation calculation){
        return new HashMap<String, Boolean>(){{
            put("feasibleDebt", calculation.getMonthlyPaymentsAmount() < calculation.getAverageMonthlyIncome());
            }};
    }
}