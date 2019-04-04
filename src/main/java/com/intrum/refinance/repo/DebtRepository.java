package com.intrum.refinance.repo;

import com.intrum.refinance.entity.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DebtRepository extends JpaRepository<Debt, Long> {}