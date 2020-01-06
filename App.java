package com.deloitte.firstmvn.hibfirst;

import java.sql.Date;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.deloitte.firstmvn.hibfirst.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        //creation-Employee emp = new Employee(101,"Ajay Saxena",1000,new Date(2010,1,3));
        Session session = factory.openSession();
        /*retrieve-Employee e = session.get(Employee.class, 101);
        if(e!=null)
        	System.out.println(e.getName()+" "+e.getSalary());*/
        //creation-Transaction trans = session.beginTransaction();
        //creation-session.save(emp);
        //creatio-trans.commit();
        /*update-Employee emp = new Employee(101,"Ajay Saxena",11000,new Date(1999,02,28));
        Transaction trans = session.beginTransaction();
        session.saveOrUpdate(emp);*/
        /*update-Employee e = session.get(Employee.class, 101);
        e.setName("Raaaju");
        session.update(e);*/
        /*delete-Employee e = session.get(Employee.class, 101);
        session.delete(e);*/
    	
    	Properties prop = new Properties();
    	prop.put("hibernate.connection.driver_class","oracle.jdbc.driver.OracleDriver");
    	prop.put("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:orcl");
    	prop.put("hibernate.connection.username","scott");
    	prop.put("hibernate.connection.password","tiger");
    	prop.put("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
    	prop.put("hibernate.show_sql","true");
    	Configuration cfg = new Configuration();
    	cfg.addAnnotatedClass(Employee.class);
    	cfg.addProperties(prop);
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Employee e = session.get(Employee.class, 109);
        if(e!=null)
        	System.out.println(e.getName()+" "+e.getSalary());
        session.close();
        factory.close();
        
    }
}
