package exe_factory_method;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equals("Circle")) {
            return new Circle();
        } else if (shapeType.equals("Square")) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
