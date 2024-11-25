/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

/**
 *
 * @author peter
 */
public abstract class ProtoEmployee {//Ask about the issue while running this
     protected String name;
     protected String role;
     protected String empId;
     protected String[] message;
     
     public ProtoEmployee(){//these constructors don't seem to be working properly need to look into
        name = " ";
        empId = " ";
        role = " ";
          message = new String[]{"Employees get free doughnuts in the staff room ","all hands on deck today","We need more staff on floor 2 ","Wet floor near morgue","Fire alarm drill in one week"};
    }
    
     public ProtoEmployee(String name, String empId, String role) {
        this.name = name;
        this.empId = empId;
        this.role = role;
          message = new String[]{"Employees get free doughnuts in the staff room ","all hands on deck today","We need more staff on floor 2 ","Wet floor near morgue","Fire alarm drill in one week"};
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getEmpId() {
        return empId;
    }
    
     public String getDetails(){
        return "Employee Details: "+empId+","+name+","+role;
    }
     public String generateMessage(){
       // initialise();
        String output;
        output = message();
        return output;
    }
      //protected abstract void initialise();
    //protected abstract void initialise();
     private String message(){
        return(message[(int)Math.floor(Math.random()*5)]);
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
