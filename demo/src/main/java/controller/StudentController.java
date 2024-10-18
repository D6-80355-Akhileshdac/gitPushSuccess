package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Student;

@RestController
public class StudentController {
	private List<Student> students = new ArrayList<>();

	@GetMapping("/students")
	public List<Student> students() {

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("akhilesh");
		student1.setLastName("wagh");

		Student student2 = new Student();
		student2.setId(1);
		student2.setFirstName("akhil");
		student2.setLastName("wa");

		students.add(student1);
		students.add(student2);
		return students;

	}
	
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}

}
