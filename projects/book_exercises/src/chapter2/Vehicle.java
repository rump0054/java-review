package chapter2;

/**
 * Vehicle Class
 */
public class Vehicle {
    public int currentSpeed;
    public double directionInDegrees;
    public String ownerName;
    public final long vehicleId;
    
    private static long nextVehicleId = 0; 
    
    public Vehicle() {
      vehicleId = Vehicle.nextVehicleId++;
    }
    
    public void printVehicle() {
      System.out.println("Vehicle: -> vehicleId: " + vehicleId);
    }
}