/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author peter
 */
public class Maintenance extends ProtoEmployee{
     private double hours;
     private String floor;
    
    public Maintenance(String name, String empId, String role) {
        super(name, empId, role);
        hours = 0.0;
        floor = " ";
        
    }

   public Maintenance(){
        super();
        hours =0.0;
        floor =" ";
    }
    

   

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFloor() {
        return floor;
    }

    
    public double getHours() {
        return hours;
    }


    
    @Override
    public String getDetails(){
        return super.getDetails()+","+hours+floor;
    }
    
    
}
