package com.example.employeeTracking;

import com.example.employeeTracking.models.Employee;
import com.example.employeeTracking.repositories.employeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTrackingApplicationTests {

	@Autowired
	employeeRepository repository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createNewEmployee(){
		Employee employee;
		employee = new Employee("Katharina", 21, 12345, "katharina@email.com");
		repository.save(employee);
	}


}
