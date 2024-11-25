/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;


public class Nurse extends ProtoEmployee{
    private String months;
    private String education;
    
    public Nurse(String name, String empId, String role) {
        super(name, empId, role);
        months = " ";
        education = " ";
       
        
    }

   public Nurse(){
        super();
        education =" ";
        months =" ";
    }

   

   

    public void setMonths(String education) {
        this.months = months;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    
    public String getMonths() {
        return months;
    }

    public String getEducation() {
        return education;
    }


    
    @Override
    public String getDetails(){
        return super.getDetails()+","+months+education;
    }
    
}

    

