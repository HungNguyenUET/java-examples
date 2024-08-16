package examples;

public class LoopDemo {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println("count: " + count);
            count++;
        }

        System.out.println("END while loop");

        for (int i = 0; i < 10; i++) {
            System.out.println("Giá trị i: " + i);
        }

        System.out.println("END for loop");
    }
}
