package br.edu.fatecfranca.api.repositories;

import br.edu.fatecfranca.api.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}