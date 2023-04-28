package com.samtel.clientes.persistance.dto;

import lombok.Data;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.constraints.NotBlank;

@Data
@SpringBootTest
public class ClienteDTOTest {
    private Long id;

    @NotBlank
    private String nombreCliente;

    @NotBlank
    private String documento;

    @NotBlank
    private String correoElectronico;
}