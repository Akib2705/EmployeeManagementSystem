package com.projectWithJdbc;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

       
public class InController {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{ 
		HashMap<Integer,BeanClass> h=new HashMap<>();
		BeanClass bc=new BeanClass();
      InEmpInterface i=new InEmpClass();
      InEmpClass i1=new InEmpClass();
      Scanner  sc = new Scanner(System.in);
      
      while(true) {
    	  System.out.println("   _____Welcome_____ ");
          System.out.println("press 1 to add");
          System.out.println("Press 2 to update");
          System.out.println("Press 3 to delete");
          System.out.println("Press 4 to fetch");
          System.out.println("Press 5 to exit application");
          
          int id=sc.nextInt();
          
          
       if(id==1) { 
    	   i.add(i, bc, sc, i1, h);
       }
       else if(id==2) {

    	   System.out.println("enter id you want to update");
    	   int id1=sc.nextInt();
    	   h.put(id1, i.update(i, bc, sc, i1, h));
       }
       else if(id==3) {
    	   i.delete(i, bc, sc, i1, h);
   	    }
       else if(id==4) {
        i.fetch(i, bc, sc, i1, h);
       }
       else if (id==5) {
    	   break;
       }
      }
	}

}
