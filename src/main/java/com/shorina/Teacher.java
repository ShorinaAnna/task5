package com.shorina; // ���� Teacher
import java.util.Scanner;

public class Teacher extends Person implements Printable{
   String TelNumber;
   String Subject;
   
   @Override
    public void print(){
        System.out.println("FirstName: "+getFirstName());
        System.out.println("SecondName: "+getSecondName());
        System.out.println("TherdName: "+getTherdName());
        System.out.println("Email: "+getEmail());
        System.out.println("TelNumber: "+getTelNumber());
        System.out.println("Subject: "+getSubject());
    }
   
   public String getTelNumber(){
       return TelNumber;
   }
   public String getSubject(){
       return Subject;
   }
   
   public void setTelNumber(String TelNumber){
        this.TelNumber=TelNumber;
    } 
   public void setSubject(String Subject){
        this.Subject=Subject;
    } 
         
   public void createTeacher(){
       createPerson();
       Scanner scanner =new Scanner(System.in);
       System.out.println("Enter Subject: ");
       String Sb = scanner.nextLine();
       System.out.println("Enter Phone number: ");
       String PT = scanner.nextLine();
       setSubject(Sb);
       setTelNumber(PT);
       //scanner.close();
    }
       
    
}
