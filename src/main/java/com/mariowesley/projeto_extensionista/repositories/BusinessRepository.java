package com.mariowesley.projeto_extensionista.repositories;

import com.mariowesley.projeto_extensionista.entities.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BusinessRepository extends JpaRepository<Business, Long> {
    Optional<Business> findByOwnerEmail(String email);
}
