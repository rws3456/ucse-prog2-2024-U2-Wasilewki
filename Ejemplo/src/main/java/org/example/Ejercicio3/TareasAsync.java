package org.example.Ejercicio3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class TareasAsync {
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
        CompletableFuture<Void> tareas = CompletableFuture.allOf(future1, future2, future3, future4);
        tareas.get();
        int suma = future1.join() + future2.join() + future3.join() + future4.join();
        System.out.println("La suma de las tareas es: " + suma);
    }
    public static int generateRandomNumber() throws InterruptedException {
        int num = ThreadLocalRandom.current().nextInt(100, 501);
        Thread.sleep(num);
        return num;
    }
}
