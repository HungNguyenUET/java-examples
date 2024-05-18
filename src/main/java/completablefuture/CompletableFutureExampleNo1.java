package completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExampleNo1 {
    public static void main(String[] args) throws Exception {
        runExampleNo3();
    }

    public static void runExampleNo1() throws Exception {
        System.out.println("Start define completableFuture");
        CompletableFuture<String> greetingFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("greeting future 1");
                System.out.println("greeting future 2");
                System.out.println("greeting future 3");
                System.out.println("greeting future 4");
                System.out.println("greeting future 5");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello World from CompletableFuture";
        });
        Thread.sleep(5);
        System.out.println("After define completableFuture");
        System.out.println(greetingFuture.get());
        System.out.println("End method");
    }

    public static void runExampleNo2() throws Exception{
        CompletableFuture<String> helloFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Hello";
        });
        CompletableFuture<String> greetingFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Word";
        });

        CompletableFuture<String> combineFuture
                = helloFuture.thenCombine(greetingFuture, (a, b) -> a + " " + b);

        System.out.println(combineFuture.get());
    }

    public static void runExampleNo3() throws Exception {
        CompletableFuture<Integer> resultFuture = CompletableFuture.supplyAsync(() -> 10 / 0)
                .exceptionally(ex -> 0);

        System.out.println(resultFuture.get());
    }
}
