package in.sp.main.services;

import java.util.List;

import in.sp.main.entities.Employee;

public interface EmployeeService {
	
	public boolean addEmployeeDetails(Employee emp);
	public List<Employee> getAllEmloyee();
	public Employee geEmpById(long id);
	public boolean updateEmpDetails(long id, float salary);
	public boolean deleteEmpDetails(long id);

}
