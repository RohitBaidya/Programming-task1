class Rectangle {
    int width;
    int height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }
}

public class task3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6);

        System.out.println("Width: " + r.width);
        System.out.println("Height: " + r.height);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
