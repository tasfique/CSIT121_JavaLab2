//Student's Full name: Tasfique Enam
//Student's ID: 5886429
package labtask2;
import java.util.*;
    
public class Main {
    public static void main (String[] args) {
        ArrayList <Vehicle> vehicleList = new ArrayList <Vehicle>(); // ArrayList.
        Truck truck = new Truck();
        Truck truck2 = new Truck();
        Aircraft aircraft = new Aircraft();
        Aircraft aircraft2 = new Aircraft();
        
        //setting the attributes
        truck.setName("Volvo");
        truck.setRegistration(4556);
        truck.setEngine("25B2");
        truck.setLoad(500); //using objects to set the setters in the other class
        truck.setTowing(1000);
        
        truck2.setName("Mercedes");
        truck2.setRegistration(6678);
        truck2.setEngine("28N1");
        truck2.setLoad(300);
        truck2.setTowing(800);
        
        
        aircraft.setName("F17");
        aircraft.setRegistration(74368);
        aircraft.setEngine("IL826");
        aircraft.setType("JetPlane");
        aircraft.setCapacity(2.5);
        
        aircraft2.setName("DHL");
        aircraft2.setRegistration(829487);
        aircraft2.setEngine("OLH357");
        aircraft2.setType("Cargo");
        aircraft2.setCapacity(5.5);
        
        //adding to the array list.
        vehicleList.add(truck);
        vehicleList.add(truck2);
        vehicleList.add(aircraft);
        vehicleList.add(aircraft2);
        
        //
        for(int i = 0; i < vehicleList.size(); i++) // using for loop to display all the objects int he ArrayList.
        {
            System.out.println("\n Data Display ");
            vehicleList.get(i).Display();
        }
        
    }
    
}
