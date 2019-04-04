package com.intrum.refinance.repo;

import com.intrum.refinance.entity.Debtor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DebtorRepository extends JpaRepository<Debtor, Long> {}