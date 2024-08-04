package org.example.Ejercicio1;

import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAvionPrivado {
    private AvionPrivado avionPrivado;
    @BeforeEach
    void setUp() {
        avionPrivado = new AvionPrivado(15000, 5);
    }
    @Test
    void TestVolarDeberiaDevolver() {
        int combustibleNecesario = avionPrivado.volar(1000);
        Assertions.assertEquals(12500, combustibleNecesario);
    }
}
