class Dog {
    private String name;
    private String breed;

    Dog(String n, String b) {
        name = n;
        breed = b;
    }

    public void setName(String n) {
        name = n;
    }

    public void setBreed(String b) {
        breed = b;
    }

    public void printInfo() {
        System.out.println(name + " is a " + breed + ".");
    }
}

public class task2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy", "Golden Retriever");
        Dog d2 = new Dog("Charlie", "Bulldog");

        d1.printInfo();
        d2.printInfo();

        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
        d1.setBreed("Labrador Retriever");
        d2.setName("Daisy");

        d1.printInfo();
        d2.printInfo();
    }
}
