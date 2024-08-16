package examples;

public class IfElseDemo {
    public static void main(String[] args) {
        int number = 11;

        // Cấu trúc 1
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn");
        }

        // Cấu trúc 2
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn");
        } else {
            System.out.println(number + " là số lẻ");
        }

        // Cấu trúc 3
        if (number % 2 == 0) {
            System.out.println(number + " là số chia hết cho 2");
        } else if (number % 3 == 0) {
            System.out.println(number + " là số chia hết cho 3");
        }
    }
}
