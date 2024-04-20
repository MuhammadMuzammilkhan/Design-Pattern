public class CircleGeometry implements Geometry {
    private final double radius;
  
    public CircleGeometry(double radius) {
      this.radius = radius;
    }
  
    @Override
    public double area() {
      return Math.PI * radius * radius;
    }
  }