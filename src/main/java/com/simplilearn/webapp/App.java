package com.simplilearn.webapp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.simplilearn.webapp.bean.Employee;

//this is the main file here

public class App 
{
    public static void main( String[] args )
    {
    	
    //Example-1 : the following way of setting data is called Tightly Coupled 
//     Instantiate Employee Object here
//    	Employee employee = new Employee();
//    	employee.setEmpId(101);
//    	employee.setName("Govind Krishna");
//    	employee.setDept("Krishna Conscious");
//    	employee.setSalary(6767890.00);
//    	
//    	System.out.println(employee);
    	
    	
    //Example-2:: Loosely Coupled 	
    // IOC :: Inversion Of Control  => Dependency Injection is a pattern we can use to implement IOC.
    	
    //First Way:: Application Context Container Type
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
    	
//    	Employee emp1 = (Employee)context.getBean("emp1");
//    	System.out.println(emp1);
//    	
//    	Employee emp2 = (Employee)context.getBean("emp2");
//    	System.out.println(emp2);
//    	
//    	Employee emp3= (Employee)context.getBean("emp3");
//    	System.out.println(emp3);
    	
    //Second Way:: Bean Factory Container 
    	
    	Resource resource = new ClassPathResource("appContext.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	
    	Employee emp1 = (Employee) factory.getBean("emp1");
    	System.out.println(emp1);
    	
    	Employee emp2 = factory.getBean("emp2",Employee.class);
    	System.out.println(emp2);
    	
     	Employee emp3 = factory.getBean("emp3",Employee.class);
    	System.out.println(emp3);
    	
    	
    }
}
