package org.sjm.project.springcore.main;

import org.sjm.project.springcore.example.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	
	public static void main(String args[])
	{
		Resource resource=new ClassPathResource("bean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Employee emp = (Employee) factory.getBean("employee");
		emp.setAge(30);
		emp.setEmployeeId(325409);
		emp.setDepartment("Development");
		emp.setEmployeeName("Kumar");
		emp.setSalary(45000f);
		System.out.println("Spring Managed Bean");
		System.out.println(emp);
	}

}
