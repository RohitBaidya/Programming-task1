class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class task4 {
    public static void main(String[] args) {
        Circle c = new Circle(3.5);

        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());

        System.out.println("\nChange radius:");
        c.setRadius(5.0);
        System.out.println("New Radius: " + c.radius);
        System.out.println("New Area: " + c.getArea());
        System.out.println("New Circumference: " + c.getCircumference());
    }
}
