package com.allmuniz.apibarbershop.repositories;

import com.allmuniz.apibarbershop.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

    boolean existsByEmail(final String email);
    boolean existsByPhone(final String phone);

    Optional<ClientEntity> findByEmail(final String email);
    Optional<ClientEntity> findByPhone(final String phone);
}
