package in.sp.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.entities.Employee;
import in.sp.main.services.EmployeeService;
import in.sp.main.services.EmployeeServiceImpl;

@SpringBootApplication
public class SpringBootWithDataJpaExample2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootWithDataJpaExample2Application.class, args);
		
		EmployeeService empService=context.getBean(EmployeeServiceImpl.class);
		
//		Employee emp=new Employee();
//		emp.setName("suyog");
//		emp.setDesignation("software Engineer");
//		emp.setSalary(65000.00f);
//		
//		boolean status=empService.addEmployeeDetails(emp);
//		if(status)
//		{
//			System.out.println("Employee inserted succefully");
//		}
//		else
//		{
//			System.out.println("Employee not inserted succefully");
//		}
		
//		List<Employee> emplist=empService.getAllEmloyee();
//		for(Employee emp:emplist)
//		{
//			System.out.println(emp.getId());
//			System.out.println(emp.getName());
//			System.out.println(emp.getDesignation());
//			System.out.println(emp.getSalary());
//			
//		}
		
//		Employee emp=empService.geEmpById(3l);
//		if(emp != null)
//		{
//			System.out.println(emp.getId());
//			System.out.println(emp.getName());
//			System.out.println(emp.getDesignation());
//			System.out.println(emp.getSalary());
//		}
//		else
//		{
//			System.out.println("employee not found");
//		}
		
//		boolean status=empService.updateEmpDetails(1L, 40000f);
//		if(status)
//		{
//			System.out.println("Employee updated succefully");
//		}
//		else
//		{
//			System.out.println("Employee not updated succefully");
//		}
		
		boolean status=empService.deleteEmpDetails(1L);
		if(status)
		{
			System.out.println("Employee deleted succefully");
		}
		else
		{
			System.out.println("Employee not deleted succefully");
		}
	}

}
