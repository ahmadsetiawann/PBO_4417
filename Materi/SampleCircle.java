class SimpleCircle{
      double radius;
      
      public SimpleCircle() {

      }
  
      public SimpleCircle(double newRadius) {
          radius = newRadius;
      }
  
      public double getArea() {
          return radius * radius * Math.PI;
      }
      
      public double getPerimeter() {
          return 2 * radius * Math.PI;
      }
      public double getRadius(double newRadius) {
          return radius;
      }
}

  