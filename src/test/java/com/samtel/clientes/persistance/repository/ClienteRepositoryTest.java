package com.samtel.clientes.persistance.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samtel.clientes.persistence.entity.ClienteEntity;

@Repository
public interface ClienteRepositoryTest extends JpaRepository<ClienteEntity, Long>{

}