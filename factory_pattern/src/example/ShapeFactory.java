package example;

public class ShapeFactory {
  // use getShape method to get an object of type shape
  public Shape getShape(String shapeType) {
    if(shapeType == null) {
      return null;
    }
    if(shapeType.equalsIgnoreCase("circle")) {
      return new Circle();
    }
    if(shapeType.equalsIgnoreCase("rectangle")) {
      return new Rectangle();
    }
    if(shapeType.equalsIgnoreCase("triangle")) {
      return new Triangle();
    }

    return null;
  }
}