package excercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException {
        demo2();
    }

    public static void demo1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("---------Start----------");
            System.out.println("Nhập chiều cao của bạn: ");
            String height = reader.readLine();
            System.out.println("Nhập cân nặng của bạn: ");
            String weight = reader.readLine();

            float heightNumber = Float.parseFloat(height);
            float weightNumber = Float.parseFloat(weight);

            float bmi = weightNumber / (heightNumber * heightNumber);
            System.out.println("Chỉ số BMI của bạn là: " + bmi);
            if (bmi < 18.5) {
                System.out.println("Theo chỉ số BMI cân nặng của bạn đang ở mức nhẹ cân");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Theo chỉ số BMI cân nặng của bạn đang ở mức bình thường");
            } else if (bmi >= 25) {
                System.out.println("Theo chỉ số BMI cân nặng của bạn đang ở mức thừa cân");
            }
            System.out.println("");
        }
    }

    public static void demo2() {
        Person[] persons = new Person[3];
        Person person1 = new Person("An", 70, 1.7F);
        Person person2 = new Person("Binh", 90, 1.6F);
        Person person3 = new Person("Chuc", 40, 1.8F);
        persons[0] = person1;
        persons[1] = person2;
        persons[2] = person3;

        int length = persons.length;
        int count = 0;

        while (count < length) {
            Person person = persons[count];
            float bmi = person.weight / (person.height * person.height);
            if (bmi < 18.5) {
                System.out.println("Chào " + person.name + ", theo chỉ số BMI cân nặng của bạn đang ở mức nhẹ cân");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Chào " + person.name + ", theo chỉ số BMI cân nặng của bạn đang ở mức bình thường");
            } else if (bmi >= 25) {
                System.out.println("Chào " + person.name + ", theo chỉ số BMI cân nặng của bạn đang ở mức thừa cân");
            }
            count++;
            System.out.println("-----------------------------------------------------------");
        }
    }
}
