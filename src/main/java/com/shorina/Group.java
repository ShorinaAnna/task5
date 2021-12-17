package com.shorina; // ���� Group
import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    public ArrayList listOfGroup=new ArrayList();
    public int groupNumber;    
    public void setGroupNumber(int groupNumber){
        this.groupNumber=groupNumber;
    }
    public ArrayList getGroup(){
       return listOfGroup;
   }
   
    public void printListGroup(){
        getGroup().forEach((obj)->{
            Student st;
            st=(Student)obj;
            st.print();
            System.out.println("----------------------------");
        });     
    }
    
  
    
    public void setStudentTotheGroup(){
        System.out.println("Enter number of students, who will be added to the list: ");
        Scanner scnn =new Scanner(System.in);
        int n = Integer.parseInt (scnn.nextLine());
                
        for (int i=0;i<n;i++){
           Student st =new Student();
           //st.createPerson();
           st.createStudent();
           st.displayDetails(st);
           listOfGroup.add(st); 
        }
        //scnn.close();
        //System.out.println("List of Group: "+listOfGroup);
        //System.out.println("Count of students: "+listOfGroup.size());
    }
    
    public void dispGroupList(){
        Student stu;
        for (Object obj: listOfGroup){
            stu=(Student)obj;
            System.out.println(stu.getFirstName()+" "+stu.getSecondName());
        }
    }
 
}
