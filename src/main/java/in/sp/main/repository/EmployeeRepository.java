package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sp.main.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
