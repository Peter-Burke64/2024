/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author peter
 */
public class Doctor extends ProtoEmployee{
    private String education;
    private String field;
    
   

    public Doctor(String name, String empId, String role) {
        super(name, empId, role);
        education = " ";
        field = " ";
    }

    public Doctor(){
        super();
        education =" ";
        field =" ";
    }

    

   

    public void setEducation(String education) {
        this.education = education;
    }

    public void setField(String field) {
        this.field = field;
    }

    
    public String getEducation() {
        return education;
    }

    public String getField() {
        return field;
    }


    
    @Override
    public String getDetails(){
        return super.getDetails()+","+education+field;
    }
    
}
