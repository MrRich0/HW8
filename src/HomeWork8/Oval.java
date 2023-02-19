package HomeWork8;

public class Oval extends ShapeAddition implements Shape{
    public Oval(int cordX, int cordY, String colorShape) {
        super(cordX, cordY, colorShape);
    }

    @Override
    public String getName() {
        return "Oval";
    }
}
