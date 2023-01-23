package tes.co.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("tes.co")
@SpringBootApplication
public class StudentDetails4Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentDetails4Application.class, args);
	}

}
