//Student's Full name: Tasfique Enam
//Student's ID: 5886429
package labtask2;

public class Vehicle {
    public int registration;
    private String name;
    private String engine;
    
    public Vehicle () {
        registration=0;
        name=null;
        engine=null;
}
    public void setRegistration (int registration) {
        this.registration = registration;
    }
    
    public void setName (String name) {
        this.name=name;
    }
    
    public void setEngine (String engine) {
        this.engine = engine;
    }
    
    public void Display () {
        System.out.println("\n Vehicle class Registration- "+registration
                +"\n Vehicle name- "+name+"\n Vehicle Engine- " +engine);
    }
    
}
