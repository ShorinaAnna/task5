package com.shorina; // ���� Student
import java.util.Scanner;

public class Student extends Person implements Printable {
    //int GroupNumber;
    public String PerTelNumber;
    public String PerFIO;
    public int cours;
    
    @Override
    public void print(){
        System.out.println("FirstName: "+getFirstName());
        System.out.println("SecondName: "+getSecondName());
        System.out.println("TherdName: "+getTherdName());
        System.out.println("Email: "+getEmail());
        System.out.println("PerTelNumber: "+getPerTelNumber());
    }
   
    void ChangeGroup() {
    }
    
    public void setPerFIO(String PerFIO){
        this.PerFIO=PerFIO;
    } 
    public void setPerTelNumber(String PerTelNumber){
        this.PerTelNumber=PerTelNumber;
    } 
    
    public String getPerFIO(){
       return PerFIO;
   }
    public String getPerTelNumber(){
       return PerTelNumber;
   }
    
    public void createStudent(){
       createPerson();
       Scanner s =new Scanner(System.in);
       System.out.println("Enter Perent Phone number: ");
       String PT = s.nextLine();
       System.out.println("Enter Perent FIO: ");
       String per = s.nextLine();
       setPerFIO(per);
       setPerTelNumber(PT);
       //s.close();
    }

    public Technology tech;
    public Check chk;
    
}
