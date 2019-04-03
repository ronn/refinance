package com.intrum.refinance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DebtorRepository extends JpaRepository<Debtor, Long> {}
