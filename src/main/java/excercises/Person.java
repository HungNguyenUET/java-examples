package excercises;

public class Person {
    public String name = "An";
    public int weight;
    public float height;

    public Person(String name, int weight, float height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Xuan", 80, 1.75F);
        person1.sayHello();

        Person person2 = new Person("Yen", 50, 1.5F);
        person2.sayHello();
    }
}
