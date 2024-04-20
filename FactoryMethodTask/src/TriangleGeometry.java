public class TriangleGeometry implements Geometry {
    private final double base;
    private final double height;
  
    public TriangleGeometry(double base, double height) {
      this.base = base;
      this.height = height;
    }
  
    @Override
    public double area() {
      return 0.5 * base * height;
    }
  }
  