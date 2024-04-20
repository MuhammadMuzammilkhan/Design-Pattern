
public class SquareGeometry implements Geometry {
    private final double side;
  
    public SquareGeometry(double side) {
      this.side = side;
    }
  
    @Override
    public double area() {
      return side * side;
    }
  }