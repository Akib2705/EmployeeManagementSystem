package com.projectWithJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;


public class InEmpClass extends BeanClass implements InEmpInterface {

	@Override
	public void add(InEmpInterface i, BeanClass bc, Scanner sc, InEmpClass i1, HashMap<Integer, BeanClass> h) throws ClassNotFoundException, SQLException {
		  System.out.println("Enter no of id: ");
		  int n=sc.nextInt();   
		  for(int j=1;j<=n;j++) {
			 
			  System.out.println("Enter your id");
			  bc.setId(sc.nextInt());
	      
	      System.out.println("Enter your name");
	      bc.setName(sc.next());
	      sc.nextLine();
	    	    	
	      System.out.println("Enter  your age");
	      bc.setAge(sc.nextInt());
		 
		 System.out.println("Enter your salaray");
		 bc.setSalary(sc.nextInt());

		    
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userid","root","root");
		        
		        String s="insert into data(id,name,age,salary)values(?,?,?,?)";
		        
		     PreparedStatement  pstmt= con.prepareStatement(s);
		     pstmt.setInt(1,bc.getId());
             pstmt.setString(2,bc.getName());
             pstmt.setInt(3,bc.getAge());
             pstmt.setInt(4,bc.getSalary());
             
            pstmt.executeUpdate();
		 
		 
		  h.put(bc.getId(), bc);
		  System.out.println("data addeed");
		  
		  System.out.println(h);		
	}

}
	
	@Override
	public void delete(InEmpInterface i, BeanClass bc, Scanner sc, InEmpClass i1, HashMap<Integer, BeanClass> h) throws ClassNotFoundException, SQLException {
	     System.out.println("Enter id you want to remove:");
     
	     int id=sc.nextInt();
     
     System.out.println(h.remove(id));
     System.out.println("removed " +id);
     
     Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userid","root","root");
	   
	String a="delete from data where id="+id;
	   PreparedStatement pstmt = con.prepareStatement(a);
	   
	   pstmt.executeUpdate();
	   
	   con.close();
	
	}
	
	
	@Override
	public BeanClass update(InEmpInterface i, BeanClass bc, Scanner sc, InEmpClass i1, HashMap<Integer, BeanClass> h) throws ClassNotFoundException, SQLException {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userid","root","root");
		return i1;
		        
		        //con.
	  
	//return bc;	
	}

	
	
	@Override
	public void fetch(InEmpInterface i, BeanClass bc, Scanner sc, InEmpClass i1, HashMap<Integer, BeanClass> h) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userid","root","root");
		        
		        Statement stmt = con.createStatement();
		        System.out.println("Enter id you want to fetch");
                ResultSet set = stmt.executeQuery("select * from data where id ="+sc.nextInt());
	  
                
                while(set.next()) {
                	int id = set.getInt(1);
                	String name = set.getString(2);
                	int age = set.getInt(3);
                	int salary = set.getInt(4);
                	
                	System.out.println(id +" "+name+" "+age+" "+salary);
                }
	  
}

}

