package com.hellographql.demo.repository;

import com.hellographql.demo.entity.Salesperson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalespersonRepository extends JpaRepository<Salesperson, Long> {

    Salesperson findSalespersonByEmail(String email);
}