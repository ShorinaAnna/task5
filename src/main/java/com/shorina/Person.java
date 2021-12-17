package com.shorina; // ���� Person
import java.util.Scanner;

public class Person {
    String ID;
    String FirstName;
    String SecondName;
    String TherdName;
    String Email;
    
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
    public void setSecondName(String SecondName){
        this.SecondName=SecondName;
    }
    public void setTherdName(String TherdName){
        this.TherdName=TherdName;
    } 
    public void setEmail(String Email){
        this.Email=Email;
    } 
    public void setID(String ID){
        this.ID=ID;
    } 
    
    public String getFirstName(){
       return FirstName;
   }
    public String getSecondName(){
       return SecondName;
   }
    public String getTherdName(){
        return TherdName;
    }
    public String getEmail(){
        return Email;
    }
    public String getID(){
        return ID;
    }
    
    public void setFIO(String FirstName,String SecondName, String TherdName){
        setFirstName(FirstName);
        setSecondName(SecondName);
        setTherdName(TherdName);
    }
    public void setFIO(String FirstName,String SecondName){
        setFirstName(FirstName);
        setSecondName(SecondName);
    }
    
    public void display(){
        String FN = getFirstName();
        System.out.println("FirstName: " + FN);
        String SN = getSecondName();
        System.out.println("SecondName: " + SN);
        String TN = getTherdName();
        System.out.println("TherdName: " + TN);
        String Em = getEmail();
        System.out.println("Email: " + Em);
    }
    
    public void displayDetails(Person cl) {
        cl.display();
        if (cl instanceof Student){
        String PerFIO = ((Student) cl).getPerFIO(); 
        System.out.println("Perent FIO: " + PerFIO);
        String PerTelNumber = ((Student) cl).getPerTelNumber(); 
        System.out.println("Perent Phone number: " + PerTelNumber);
        } else if (cl instanceof Teacher){
        String Subject = ((Teacher) cl).getSubject(); 
        System.out.println("Subgect: " + Subject);
        String TelNumber = ((Teacher) cl).getTelNumber(); 
        System.out.println("Phone number: " + TelNumber);
        }
    }
    
    public void createPerson(){
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter ID: ");
       String id = sc.nextLine();
       System.out.println("Enter First Name: ");
       String FN = sc.nextLine();
       System.out.println("Enter Second Name: ");
       String SN = sc.nextLine();
       System.out.println("Enter Therd Name: ");
       String TN = sc.nextLine();
       System.out.println("Enter Email: ");
       String Em = sc.nextLine();
       setID(id);
       setFIO(FN,SN,TN);
       setEmail(Em);
       //sc.close();
    }
      
}
