package com.samtel.clientes.persistance.service.impl;

import com.samtel.clientes.persistance.service.ClientServiceTest;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.IntStream;


@Service
@RequiredArgsConstructor
@SpringBootTest
public class ServiceImplTest implements ClientServiceTest {

    @Override
    @Test
    public void CalcularAlgo() {
        int x,y, total;
        x= 20;
        y = 40;
        total = x+y;
    }

    @Override
    @Test
    public void NumerosRandom() {
        Random random = new Random();
        IntStream Numeros = random.ints(15, 1,100);
        Numeros.forEach(value -> System.out.println("Numero random: "+value));
    }

    @Override
    @Test
    public void ModificarCampo() {
        String name = "SOPLAME";
        if(name.isEmpty())
        {
            throw new NoSuchElementException("ESTA VACIO");
        }
    }

    @Override
    @Test
    public void Enteros() {
        int [] Numeros = {2,4};
        int Contador = Numeros.length;
        System.out.println(Contador);
    }

}
