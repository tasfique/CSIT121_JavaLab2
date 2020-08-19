//Student's Full name: Tasfique Enam
//Student's ID: 5886429
package labtask2;

public class Aircraft extends Vehicle {
    private String typeAircraft;
    private double capacity;
    
    public Aircraft () {
        super(); //this super method
        typeAircraft = null;
        capacity = 0.0;
    }
    
    public void setType (String typeAircraft) {
        this.typeAircraft = typeAircraft;
    }
    
    public void setCapacity (double capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public void Display () {
        super.Display();
        System.out.println("\n Aircraft Type- "+typeAircraft+"\n Aircraft Capacity- "+capacity);
    }
}
