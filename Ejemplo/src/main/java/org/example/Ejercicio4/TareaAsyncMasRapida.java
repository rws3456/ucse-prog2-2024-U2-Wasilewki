package org.example.Ejercicio4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.example.Ejercicio3.TareasAsync.generateRandomNumber;

public class TareaAsyncMasRapida {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                return generateRandomNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                return generateRandomNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                return generateRandomNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> {
            try {
                return generateRandomNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Object> First = CompletableFuture.anyOf(future1, future2, future3, future4);
            System.out.println("El valor del primer futuro es: " + First.get());
    }
}
