package ali.lesson.lesson8Hours;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

	private final StudentRepository studentRepository;

	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@PostMapping("/students")
	public Student post(
			@RequestBody Student student
	) {
		return studentRepository.save(student);
	}

	@GetMapping("/students")
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@GetMapping("/students/{id}")
	public Student get(
			@PathVariable Long id
	) {
		return studentRepository.findById(id)
				.orElse(new Student());
	}

	@GetMapping("/students/search/{firstName}")
	public List<Student> findByName(
			@PathVariable String firstName
	) {
		return studentRepository.findAllByFirstNameContaining(firstName);
	}

	@DeleteMapping("/students/{id}")
	public void delete(
			@PathVariable Long id
	) {
		studentRepository.deleteById(id);
	}
}
