package examples;

public class StringDemo {
    public static void main(String[] args) {
        String demoStr = "abc";
        String name = "Nguyen Van A";

        System.out.println(demoStr.length());

        if(demoStr.isBlank()) {
            System.out.println("demoStr is Blank");
        }
    }
}
