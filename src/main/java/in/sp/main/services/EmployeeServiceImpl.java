package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.sp.main.entities.Employee;
import in.sp.main.repository.EmployeeRepository;

@Repository
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeerepository;
	
	@Override
	public boolean addEmployeeDetails(Employee emp) {

		boolean status=false;
		try
		{
			employeerepository.save(emp);
			status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		return status;
	}

	@Override
	public List<Employee> getAllEmloyee() {


		return employeerepository.findAll();
	}

	@Override
	public Employee geEmpById(long id) {

		Optional<Employee> opt=employeerepository.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		return null;
	}

	@Override
	public boolean updateEmpDetails(long id, float salary) {

		Employee emp=geEmpById(id);
		if(emp!=null)
		{
			emp.setSalary(salary);
			employeerepository.save(emp);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmpDetails(long id) {

		boolean status=false;
		try
		{
			employeerepository.deleteById(id);
			status=true;
		} 
		catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		return status;
	}
	

}
