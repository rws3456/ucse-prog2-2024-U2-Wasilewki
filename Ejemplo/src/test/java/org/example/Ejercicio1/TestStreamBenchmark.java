package org.example.Ejercicio1;

import org.example.StreamBenchmark;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestStreamBenchmark {
    private StreamBenchmark streamBenchmark;
    @BeforeEach
    void setUp() {
        streamBenchmark = new StreamBenchmark();
    }
    @Test
    void TesteoCreateList_SizeDeberiadevolver10000000() {
        List<Integer> list = streamBenchmark.CreateList();
        Assertions.assertEquals(10000000, list.size());
    }
    @Test
    void ListaSecuencialNoDeberiaEstarVacia() {
        List<Integer> list = streamBenchmark.ListaSecuencial();
        Assertions.assertFalse(list.isEmpty());
    }
    @Test
    void ListaParalelaNoDeberiaEstarVacia() {
        List<Integer> list = streamBenchmark.ListaParalela();
        Assertions.assertFalse(list.isEmpty());
    }
}
