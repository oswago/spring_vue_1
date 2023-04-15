package com.afwit.springbootbackend;

import com.afwit.springbootbackend.entity.Employee;
import com.afwit.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee1=Employee.builder()
				.firstName("Goddwin")
				.lastName("Lombok")
				.email("lombd@gmail.com")
				.build();
		Employee employee2=Employee.builder()
				.firstName("Gospel")
				.lastName("Jane")
				.email("jan@gmail.com")
				.build();
		Employee employee3=Employee.builder()
				.firstName("Samson")
				.lastName("Chege")
				.email("chet@gmail.com")
				.build();
		Employee employee4=Employee.builder()
				.firstName("Eric")
				.lastName("Cosmos")
				.email("cos@gmail.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);

	}
}
