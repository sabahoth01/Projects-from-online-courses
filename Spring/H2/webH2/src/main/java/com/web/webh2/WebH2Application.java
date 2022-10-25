package com.web.webh2;

import com.web.webh2.api.model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebH2Application implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run( WebH2Application.class, args );
    }

    @Override
    public void run(String... args) throws Exception {
        //Iterable<Employee> employee = employeeService.getEmployees();
        //System.out.println(employee);
    }
}
