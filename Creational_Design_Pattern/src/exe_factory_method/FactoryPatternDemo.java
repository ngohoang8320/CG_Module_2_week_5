package exe_factory_method;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape sq = shapeFactory.getShape("Square");
        Shape cir = shapeFactory.getShape("Circle");
        Shape re = shapeFactory.getShape("Rectangle");

        sq.draw();
        cir.draw();
        re.draw();
    }
}
