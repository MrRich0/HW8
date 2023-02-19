package HomeWork8;

public class Diamond extends ShapeAddition implements Shape{

    public Diamond(int cordX, int cordY, String colorShape) {
        super(cordX, cordY, colorShape);
    }

    @Override
    public String getName() {
        return "Diamond";
    }
}
