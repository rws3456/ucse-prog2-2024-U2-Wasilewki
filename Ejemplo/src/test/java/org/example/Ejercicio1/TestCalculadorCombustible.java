package org.example.Ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculadorCombustible {
    private CalculadorCombustible calculador;
    @BeforeEach
    void setUp() {
       calculador = CalculadorCombustible.getInstance();
    }
    @Test
    void testCheckInstanciasIguales() {
        CalculadorCombustible calculador2 = CalculadorCombustible.getInstance();
        Assertions.assertEquals(calculador2, calculador);
    }
    @Test
    void testCalcularCombustibleAvionPrivadoDeberiaDevolver20000() {
        AvionPrivado avion = new AvionPrivado(20000, 10);
        int consumo = calculador.calcularCombustible(avion, 1000);
        Assertions.assertEquals(20000, consumo);
    }
    @Test
    void testCalcularCombustibleAvionComercialDeberiaDevolver() {
        AvionComercial avion = new AvionComercial(50000, 20);
        int consumo = calculador.calcularCombustible(avion, 2000);
        Assertions.assertEquals(40000, consumo);
    }
}
