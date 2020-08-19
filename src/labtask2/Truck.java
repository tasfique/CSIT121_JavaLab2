//Student's Full name: Tasfique Enam
//Student's ID: 5886429
package labtask2;

public class Truck extends Vehicle {
    private double loadCapacity;
    private double towingCapacity;
    
    public Truck () {
        super();
        registration = 0;
        loadCapacity = 0.0;
        towingCapacity = 0.0;
    }
    
    public void setLoad (double loadCapacity) {
        this.loadCapacity=loadCapacity;
    }
    
    public void setTowing (double towingCapacity) {
        this.towingCapacity=towingCapacity;
    }
    
    @Override
    public void Display () {
        super.Display();
        System.out.println("\n Truck Type- "+loadCapacity+"\n Truck Capacity- "+towingCapacity);
    }
    
    

}
