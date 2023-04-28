package com.samtel.clientes.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.springframework.boot.test.context.SpringBootTest;


@Entity
@Table(name = "clientes")
@Data
@SpringBootTest
public class ClienteEntityTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Column(name = "nombre_cliente", length = 255 )
    private String nombre;

    @Column(name = "documento", length = 20, unique = true)
    private String dni;

    @Column(nullable = false)
    private String correo;
}