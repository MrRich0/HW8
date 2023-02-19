package HomeWork8;

public class ShapeTests {
    public static void main(String[] args) {

        Square square = new Square(1, 3,"Black");
        square.printName(square);
        System.out.println(square);
        System.out.println();
        Circle circle = new Circle(7, 7,"White");
        square.printName(circle);
        System.out.println(circle);
        System.out.println();
        Diamond diamond = new Diamond(3, 2,"Purple");
        square.printName(diamond);
        System.out.println(diamond);
        System.out.println();
        Oval oval = new Oval(3, 5,"Orange");
        square.printName(oval);
        System.out.println(oval);
        System.out.println();
        Triangle triangle = new Triangle(6, 1,"Red");
        square.printName(triangle);
        System.out.println(triangle);

    }
}
