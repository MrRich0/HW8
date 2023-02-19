package HomeWork8;

public abstract class ShapeAddition extends ShapePrinter {
    final private int cordX;
    final private int cordY;
    final private String colorShape;

    public ShapeAddition(int cordX, int cordY, String colorShape) {
        this.cordX = cordX;
        this.cordY = cordY;
        this.colorShape = colorShape;
    }

    public int getCordX() {
        return cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public String getColorShape() {
        return colorShape;
    }

    @Override
    public String toString() {
        return "Additional Information:\n" +
                "cordX:" + getCordX() + " cordY:" + getCordY() +
                " Color:" + getColorShape();

    }
}
