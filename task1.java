class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void printInfo() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class task1 {
    public static void main(String[] args) {
        Person p1 = new Person("emon", 11);
        Person p2 = new Person("remon", 12);

        p1.printInfo();
        p2.printInfo();

        System.out.println("\nSet new age and name:");
        p1.age = 14;
        p2.name = "emon";

        p1.printInfo();
        p2.printInfo();
    }
}
