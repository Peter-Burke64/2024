/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalapp;

//import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author peter
 */
public class ProtoEmployeeUI {
    private ProtoEmployee employees[];
    private int count;
    
     public ProtoEmployeeUI() {
        count = 0;//
        employees = new ProtoEmployee[5];
    }
     public void menu() {
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Add \n 2. Print \n 3. Search \n 4.Delete"));
        switch (ans) {
            case 1:
                add();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            default:
                break;
        }
    }
    public void add() {
        int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Which type of Employee do you want to add? 1. Doctor 2. Nurse 3. maintanence"));
        if (type == 1) {
            
            
            Doctor d= new Doctor();
           
            d.setName(JOptionPane.showInputDialog(null, "Enter Name:"));
            d.setEmpId(JOptionPane.showInputDialog(null, "Enter ID:"));
            d.setRole(JOptionPane.showInputDialog(null, "Enter Role:"));
            d.setEducation(JOptionPane.showInputDialog(null, "Enter Education details"));
            d.setField(JOptionPane.showInputDialog(null,"Enter Field"));

           
            employees[count] = d;
            count++;
            //employees.add(d);
        }else if (type == 2) {
            Nurse n = new Nurse();
            n.setName(JOptionPane.showInputDialog(null, "Enter Name:"));
            n.setEmpId(JOptionPane.showInputDialog(null, "Enter ID:"));
            n.setRole(JOptionPane.showInputDialog(null, "Enter role:"));
            n.setMonths(JOptionPane.showInputDialog(null, "Enter months present:"));
            n.setEducation(JOptionPane.showInputDialog(null, "Enter Education details"));
            employees[count] = n;
            count++;
        }else if (type == 3) {
            Maintenance m = new Maintenance();
            m.setName(JOptionPane.showInputDialog(null, "Enter Name:"));
            m.setEmpId(JOptionPane.showInputDialog(null, "Enter ID:"));
            m.setRole(JOptionPane.showInputDialog(null, "Enter Role:"));
            m.setHours(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hours:")));
            m.setFloor(JOptionPane.showInputDialog(null, "Enter Floor:"));
            employees[count] = m;
            count++;
        }   
}
    public void print() {
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, their are no employees to print");
        } else {
            for (int i = 0; i < count; i++) {
                ProtoEmployee e = employees[i];
                if (e instanceof Doctor) {
                    JOptionPane.showMessageDialog(null, "Name:" + e.getName() + ", role:" + e.getRole() + ", ID: " + e.getEmpId() + ", Education:" + ((Doctor) e).getEducation()+", field:"+((Doctor) e).getField());
                } else if (e instanceof Nurse) {
                    JOptionPane.showMessageDialog(null, "Name:" + e.getName() + ", role:" + e.getRole() + ", ID: " + e.getEmpId() + ", Months:" + ((Nurse) e).getMonths() + ",Eduction: " + ((Nurse) e).getEducation());
                }
                else if (e instanceof Maintenance) {
                    JOptionPane.showMessageDialog(null, "Name:" + e.getName() + ", role:" + e.getRole() + ", ID: " + e.getEmpId() + ", Hours:" + ((Maintenance) e).getHours()+", Floor"+((Maintenance) e).getFloor());
                }
            }
        }
    }
    public void search(){
        if(count==0){
            JOptionPane.showMessageDialog(null, "No employees in databse");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null,"enter id for employee");
            
            for(int i = 0; i < count;i++){
                if(employees[i].getEmpId().equalsIgnoreCase(searchTerm)){
                    JOptionPane.showMessageDialog(null,employees[i].getDetails());
                }
            }
        }
    }
    public void delete(){
        if(count==0){
            JOptionPane.showMessageDialog(null," no employees in database");
        }
        else{
            String searchTerm = JOptionPane.showInputDialog(null,"enter id to remove ");
            for(int i = 0; i < count;i++){
                if(employees[i].getEmpId().equalsIgnoreCase(searchTerm)){
                    employees[i]=employees[count-1];
                    count--;
                    JOptionPane.showMessageDialog(null,"Employee with the id "+searchTerm+" was removed." );
                }
            }
        }
    }
}


