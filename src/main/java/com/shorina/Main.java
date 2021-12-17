package com.shorina; // ���� Main
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args)  {
        System.out.println(2+2);

        /*int u=1;
        ArrayList listOfTeacher=new ArrayList();
        ArrayList listOfGR=new ArrayList();
        while(u!=0){
            System.out.println("Menu: "+"\n"+"Add student - press 1;"+"\n"+"Add teacher - press 2;"+"\n"+"List of groups - press 3;"+"\n"+"List of teachers - press 4;"+"\n"+"Exit - press 5;");
            Scanner sca =new Scanner(System.in);
            String m0=sca.nextLine();
            int m = Integer.parseInt (m0);

            switch (m){
                case 1:
                    System.out.println("Enter group number in which you will add students:");
                    Group g=new Group();
                    listOfGR.add(g);
                    Scanner scan =new Scanner(System.in);
                    int k = Integer.parseInt (scan.nextLine());
                    g.setGroupNumber(k);
                    g.setStudentTotheGroup();
                    //scan.close();
                break;

                case 2:
                    Teacher tch =new Teacher();
                    tch.createTeacher();
                    tch.displayDetails(tch);
                    listOfTeacher.add(tch); 
                break;

                case 3:
                    System.out.println("Enter group number:");
                    Scanner p =new Scanner(System.in);
                    int l = Integer.parseInt (p.nextLine());
                    Group gr;
                    for (Object obj: listOfGR){
                        gr=(Group)obj;
                        if(gr.groupNumber==l){
                            gr.dispGroupList();} else System.out.println("Error group number:");
                    }
                    
                break;

                case 4:
                    Teacher teac;
                    for (Object obj: listOfTeacher){
                        teac=(Teacher)obj;
                        System.out.println(teac.getFirstName()+" "+teac.getSecondName()+"\t"+""+teac.getSubject());
                    }
                break;

                case 5:
                    u=0;
                break;

                default:
                    System.out.println("Error");
                break; 
            }
           
        }*/
        /*
        Student st1=new Student();
        st1.tech=new GoogleClass();
        st1.tech.sendQuestion();
        Student st2=new Student();
        st2.tech=new Webinar();
        st2.tech.sendQuestion();
        Student st3=new Student();
        st3.tech=new BB();
        st3.tech.sendQuestion();
        st3.chk=new BB();
        st3.chk.passCheck();
        */
        /*
        Printer myprinter = new Printer();
        Student st1=new Student();
        st1.setFIO("Shorina", "Anna", "Alekseevna");
        st1.setEmail("anna@");
        st1.setPerTelNumber("89072580");
        myprinter.printToScreen(st1);
        Student st2=new Student();
        st2.setFIO("Titarenko", "Polina", "Evgenevna");
        st2.setEmail("poly@");
        st2.setPerTelNumber("3247516");
        myprinter.printToScreen(st2);
        */
        /*
        Printer myprinter2 = new Printer();
        Teacher tch1=new Teacher();
        tch1.setFIO("Shorina", "Natalia", "Alekseevna");
        tch1.setEmail("nata@");
        tch1.setTelNumber("173250");
        tch1.setSubject("math");
        myprinter2.printToScreen(tch1);
        */
        /*Group g=new Group();
        g.listOfGroup.add(st1);
        g.listOfGroup.add(st2);
        g.printListGroup();*/
       
        
    }
    
    
}


