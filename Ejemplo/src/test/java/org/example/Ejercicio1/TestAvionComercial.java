package org.example.Ejercicio1;

import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAvionComercial {
private AvionComercial avionComercial;
@BeforeEach
    void setUp() {
    avionComercial = new AvionComercial(50000, 10);
}
@Test
    void TestGetCapacidadCombustibleDeberiaDevolver1500() {
    int capacidad = avionComercial.getCapacidadCombustible();
    Assertions.assertEquals(50000, capacidad);
}
@Test
    void TestGetConsumoCombusibleDeberiaDevolver20() {
    int consumo = avionComercial.getConsumoCombustible();
    Assertions.assertEquals(10, consumo);
}
@Test
    void TestVolarDeberiaDevolver() {
    int combustibleNecesario = avionComercial.volar(2000);
    Assertions.assertEquals(20000, combustibleNecesario);
}
}
