package br.edu.fatecfranca.api.repositories;

import br.edu.fatecfranca.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}