public class AbstractFactoryDemo {

    public static void main(String[] args) {
        // Create a factory for single border shapes
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        // Create shapes with single border
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        Shape triangle = shapeFactory.getShape("TRIANGLE"); // Use Triangle now
        triangle.draw();

        // Create a factory for double border shapes
        AbstractFactory doubleBorderedShapeFactory = FactoryProducer.getFactory(true);

        // Create shapes with double border
        Shape doubleBorderedRectangle = doubleBorderedShapeFactory.getShape("RECTANGLE");
        doubleBorderedRectangle.draw();
        System.out.println(((BorderedShape) doubleBorderedRectangle).getBorderType()); // Check border type

        Shape doubleBorderedTriangle = doubleBorderedShapeFactory.getShape("TRIANGLE");
        doubleBorderedTriangle.draw();
        System.out.println(((BorderedShape) doubleBorderedTriangle).getBorderType()); // Check border type
    }
}