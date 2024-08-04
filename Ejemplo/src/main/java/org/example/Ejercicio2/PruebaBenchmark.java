package org.example.Ejercicio2;

import org.example.Ejercicio1.StreamBenchmark;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class PruebaBenchmark {
    private StreamBenchmark streamBenchmark;
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(PruebaBenchmark.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
    @Setup(Level.Trial)
    public void setUp() {
        streamBenchmark = new StreamBenchmark();
    }
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void resultSecuencial(Blackhole blackhole) {
        blackhole.consume(streamBenchmark.ListaSecuencial());
    }
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void resultParalelo(Blackhole blackhole) {
        blackhole.consume(streamBenchmark.ListaParalela());
    }

}
