package com.deloitte.thirdmvn.hibthird;

import java.sql.Date;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.thirdmvn.hibthird.entity.AadharCard;
import com.deloitte.thirdmvn.hibthird.entity.Courses;
import com.deloitte.thirdmvn.hibthird.entity.Department;
import com.deloitte.thirdmvn.hibthird.entity.Employee;
import com.deloitte.thirdmvn.hibthird.entity.Person;
import com.deloitte.thirdmvn.hibthird.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
       /* Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Person p1 = session.get(Person.class, "Ajay Saxena");
        if(p1!=null) {
        	System.out.println(p1.getAddress()+" "+p1.getAge());
        	AadharCard ac = p1.getAcard();
        	System.out.println(ac.getAid()+" "+ac.getIssueAuth());
        }
        AadharCard ac1 = session.get(AadharCard.class, 7001);
        if(ac1!=null) {
        	System.out.println(ac1.getAid()+" "+ac1.getIssueAuth());
        	Person p2  = ac1.getPerson();
        	System.out.println(p2.getAddress()+" "+p2.getAge());
        }
        		
        session.close();
        factory.close(); */
    	Configuration cfg = new Configuration();
    	cfg.addAnnotatedClass(Courses.class);
    	cfg.addAnnotatedClass(Student.class);
    	
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        /* Employee e1 = new Employee(101,"Ajay",1000);
        Employee e2 = new Employee(102,"Babu",2000);
        Employee e3 = new Employee(103,"Chandu",3000);
        Employee e4 = new Employee(104,"Dinesh",4000);
        ArrayList<Employee> el1 = new ArrayList<Employee>();
        ArrayList<Employee> el2 = new ArrayList<Employee>();
        el1.add(e1); el1.add(e2);
        el2.add(e3); el2.add(e4);
        Department d1 = new Department(10,"Sales",el1);
        Department d2 = new Department(11,"Marketing",el2);
        session.save(e1); session.save(e2); session.save(e3); session.save(e4);
        session.save(d1); session.save(d2); */
        
       /* Department d = session.get(Department.class,11);
        session.delete(d);
        session.beginTransaction().commit();
        session.close();
        factory.close(); */
        
        
        Courses c = session.get(Courses.class, 7001);
        if(c!=null) {
        	System.out.println(c.getCname()+" "+c.getDuration());
        	for(Student s : c.getSlist()) {
        		System.out.println(s.getSid()+ " "+s.getSname());
        	}
        }
        
        Student s = session.get(Student.class, 103);
        if(s!=null) {
        	System.out.println(s.getSid()+" "+s.getSname());
        	for(Courses c1 : s.getClist())
        		System.out.println(c1.getCid()+" "+c1.getCname());
        }
        session.close();
        factory.close();
    }
}
