package objectives;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 40);
        Rectangle rectangle1 = new Rectangle(3.5, 35.9);
        System.out.println(rectangle1.getPerimeter());
    }

    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double newWidth, double newHeigh) {
        width = newWidth;
        height = newHeigh;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}
