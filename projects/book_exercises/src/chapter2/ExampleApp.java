package chapter2;

public class ExampleApp {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();
        
        /*System.out.println("First Vehicle Id:: 0 :: " + v.vehicleId);
        System.out.println("Second Vehicle Id:: 1 :: " + v2.vehicleId);
        System.out.println("Next Vehicle id from static Vehicle field " + Vehicle.nextVehicleId);*/
        
        LinkedList list = new LinkedList();
        list.listItem = v;
        
        LinkedList list2 = new LinkedList();
        list2.listItem = v2;
        
        LinkedList list3 = new LinkedList();
        list3.listItem = v3;
        
        list.nextList = list2;
        list2.nextList = list3;       
        list3.nextList = null;
        
        list2.listItem.printVehicle();
    }
}