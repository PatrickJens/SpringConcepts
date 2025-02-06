package concepts.main;

import concepts.main.dao.StudentDAO;
import concepts.main.entities.SpringStudent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//small change for git config commit
@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

		SpringApplication.run(MainApplication.class, args);
		int x = 1;
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		// create student
		System.out.println("Creating the student object...");
		SpringStudent tempStudent = new SpringStudent("Jake", "Paul", "jpaul@tamu.edu");

		// save student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated Id: " + tempStudent.getId());

		//Display Id of the student

	}

}
