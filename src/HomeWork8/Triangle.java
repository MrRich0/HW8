package HomeWork8;

public class Triangle extends ShapeAddition implements Shape{

    public Triangle(int cordX, int cordY, String colorShape) {
        super(cordX, cordY, colorShape);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
