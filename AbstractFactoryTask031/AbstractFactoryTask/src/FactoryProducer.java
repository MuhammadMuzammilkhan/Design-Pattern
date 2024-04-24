public class FactoryProducer {
    public static AbstractFactory getFactory(boolean doubleBordered) {
        if (doubleBordered) {
            return new DoubleBorderedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}