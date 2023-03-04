import java.util.*;
class Shape {
    public void printShape() {

        System.out.println("This is a Shape");
    }
}

class Rectangle extends Shape {
    public void printShape() {


        System.out.println("This is a Rectangular Shape");
    }
}

class Circle extends Shape {
    public void printShape() {

        System.out.println("This is a Circular Shape");
    }
}

class Square extends Rectangle {
    public void printShape() {

        System.out.println("Square is a Rectangle");
    }


    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();
        square.printShape();
    }
}
