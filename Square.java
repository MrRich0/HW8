package HomeWork8;

public class Square extends ShapeAddition implements Shape{

    public Square(int cordX, int cordY, String colorShape) {
        super(cordX, cordY, colorShape);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
