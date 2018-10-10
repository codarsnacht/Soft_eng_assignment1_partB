/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng3assignment1partb;

import com.mycompany.softeng3assignment1.courseProgramme;
import com.mycompany.softeng3assignment1.module;
import com.mycompany.softeng3assignment1.student;
import org.joda.time.DateTime;

/**
 *
 * @author Joseph
 */
public class mainTester {
    
      public static void main(String[] args) {
              //creating the required stuff
    student s1 = new student("John", 20, "10/11/97", 1234);
    student s2= new student("Billy", 41, "10/11/77", 1264);
    student s3 = new student("Mary", 19, "10/11/99", 1255);
    
    module m1 = new module("jazz", "101");
    module m2 = new module("sax", "102");
    module m3 = new module("bass", "101");
    module m4 = new module("drums", "102");
    
    
      
      DateTime d1 = new DateTime(2015); //start date 
      DateTime d2 = new DateTime(2018); //end date
        
    courseProgramme cp = new courseProgramme ("Ct101", d1 , d2 );
    courseProgramme cp2 = new courseProgramme ("Ct201", d1 , d2 );
      /*    
    s1.addModule(m2);
    s1.addModule(m4);
    s2.addModule(m1);
    s2.addModule(m2);
    s3.addModule(m3);
    s3.addModule(m4);
    
    s1.addCourse(cp);
    s2.addCourse(cp);
    s3.addCourse(cp2);
    */
            m1.addStudent(s1); //should add students to the modules
    m2.addStudent(s1);
    m1.addStudent(s2);
     m2.addStudent(s2);
     m3.addStudent(s3);
      m4.addStudent(s3);
      
      //adds modules to course
      cp.addModules(m1);
      cp.addModules(m2);
      cp2.addModules(m4);
      cp2.addModules(m3);
      
        System.out.println("Results ");
          System.out.println("");
      
      
          System.out.println("the first module ("+ m1.getModname()+ ") contains " + m1.getListStudents());
          System.out.println("the second module ("+ m2.getModname()+ ") contains " + m2.getListStudents());
          System.out.println("the third module ("+ m3.getModname()+ ") contains " + m3.getListStudents());
          System.out.println("the fourth module ("+ m4.getModname()+ ") contains " + m4.getListStudents());
          
          
           System.out.println("the first course programme ("+ cp.getName()+ ") contains " + cp.getListMods() + " modules");
        System.out.println("the second course programme ("+ cp2.getName()+ ") contains " + cp2.getListMods() + " modules");
          
      
       //for student 1
       System.out.print("Student "+ s1.getName() +" ("+ s1.getUsername() +")"+ " is registered for ");
               if (m1.getListStudents().contains(s1.getName())){
                 System.out.print( m1.getModname() ); 
               }
                if (m2.getListStudents().contains(s1.getName())){
                   System.out.print(", " + m2.getModname()); 
                }
                 if (m3.getListStudents().contains(s1.getName())){
                   System.out.print( ", " + m3.getModname()); 
               }
                  if (m4.getListStudents().contains(s1.getName())){
                   System.out.print(", " + m4.getModname()); 
               }
                  
                  //checking what course they are part off
                    if (m4.getListStudents().contains(s1.getName()) && (m3.getListStudents().contains(s1.getName()) ))
                  {
                      System.out.println(" and is registered for Ct201");
                  }
                   if (m1.getListStudents().contains(s1.getName()) && (m2.getListStudents().contains(s1.getName()) ))
                  {
                      System.out.println(" and is registered for Ct101");
                  }
      System.out.println();
      
      //for student 2
       System.out.print("Student "+ s2.getName() +" ("+ s2.getUsername() +")"+ " is registered for ");
               if (m1.getListStudents().contains(s2.getName())){
                 System.out.print( m1.getModname() ); 
               }
                if (m2.getListStudents().contains(s2.getName())){
                   System.out.print( ", " + m2.getModname()); 
                }
                 if (m3.getListStudents().contains(s2.getName())){
                   System.out.print( ", " + m3.getModname()); 
               }
                  if (m4.getListStudents().contains(s2.getName())){
                   System.out.print(", " + m4.getModname()); 
               }
                  //checking what course they are part off
                  
                    if (m4.getListStudents().contains(s2.getName()) && (m3.getListStudents().contains(s2.getName()) ))
                  {
                      System.out.println(" and is registered for Ct201");
                  }
                   if (m1.getListStudents().contains(s2.getName()) && (m2.getListStudents().contains(s2.getName()) ))
                  {
                      System.out.println(" and is registered for Ct101");
                  }
                  System.out.println();//print new line
                  //for student 3
       System.out.print("Student "+ s3.getName() +" ("+ s3.getUsername() +")"+ " is registered for ");
               if (m1.getListStudents().contains(s3.getName())){
                 System.out.print( m1.getModname() ); 
               }
                if (m2.getListStudents().contains(s3.getName())){
                   System.out.print(  m2.getModname()); 
                }
                 if (m3.getListStudents().contains(s3.getName())){
                   System.out.print( m3.getModname()); 
               }
                  if (m4.getListStudents().contains(s3.getName())){
                   System.out.print(", " + m4.getModname()); 
               }
                  
                  //checking what course they are part off
                  if (m4.getListStudents().contains(s3.getName()) && (m3.getListStudents().contains(s3.getName()) ))
                  {
                      System.out.println(" and is registered for Ct201");
                  }
                   if (m1.getListStudents().contains(s3.getName()) && (m2.getListStudents().contains(s3.getName()) ))
                  {
                      System.out.println(" and is registered for Ct101");
                  }
                  
      System.out.println();
      }
      
      
}
