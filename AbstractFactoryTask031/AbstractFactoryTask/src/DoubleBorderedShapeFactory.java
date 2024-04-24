public class DoubleBorderedShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new DoubleBorderedRectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new DoubleBorderedTriangle();
        }
        return null;
    }
}