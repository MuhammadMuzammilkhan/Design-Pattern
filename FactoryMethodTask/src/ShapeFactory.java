public class ShapeFactory {
    public static Geometry getShape(String shapeType) {
      switch (shapeType) {
        case "square":
          return new SquareGeometry(4);
        case "circle":
          return new CircleGeometry(2);
        case "triangle":
          return new TriangleGeometry(5, 3);
        default:
          throw new IllegalArgumentException("Invalid shape type: " + shapeType);
      }
    }
  }