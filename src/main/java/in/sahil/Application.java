package in.sahil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sahil.entity.Student;
import in.sahil.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepository studentRepo = context.getBean(StudentRepository.class);
		//System.out.println(studentRepository.getClass().getName());
		
		Student s = new Student();
		s.setId(102);
		s.setName("Raja");
		s.setRank(1231L);
		s.setGender("Male");
		
		studentRepo.save(s);
		
		System.out.println("Record Inserted...");
		

}
	
}