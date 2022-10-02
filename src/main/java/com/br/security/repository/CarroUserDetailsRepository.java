package com.br.security.repository;

import com.br.security.entity.CarroEntity;
import com.br.security.entity.CarroUserDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarroUserDetailsRepository extends JpaRepository<CarroUserDetailsEntity, UUID> {
    CarroUserDetailsEntity findByUsername(String username);
}
