package example;

public class FactoryPatternDemo {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    // get a Circle and draw it
    Shape shape1 = shapeFactory.getShape("Circle");
    shape1.draw();

    // get a Rectangle and draw it
    Shape shape2 = shapeFactory.getShape("Rectangle");
    shape2.draw();

    // get a Triangle and draw it
    Shape shape3 = shapeFactory.getShape("Triangle");
    shape3.draw();
  }
}