package HomeWork8;

public class Circle extends ShapeAddition implements Shape {

    public Circle(int cordX, int cordY, String colorShape) {
        super(cordX, cordY, colorShape);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
