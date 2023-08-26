package com.projectWithJdbc;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;


public interface InEmpInterface {


    void add(InEmpInterface i, BeanClass bc, Scanner sc, InEmpClass i1, HashMap<Integer, BeanClass> h) throws ClassNotFoundException, SQLException ;
    
    BeanClass update(InEmpInterface i, BeanClass bc, Scanner sc, InEmpClass i1, HashMap<Integer, BeanClass> h) throws ClassNotFoundException, SQLException;
    
    void delete(InEmpInterface i, BeanClass bc, Scanner sc, InEmpClass i1, HashMap<Integer, BeanClass> h) throws ClassNotFoundException, SQLException;
    
    void fetch(InEmpInterface i, BeanClass bc, Scanner sc, InEmpClass i1, HashMap<Integer, BeanClass> h) throws ClassNotFoundException, SQLException;
	
	
	
	
	
}
