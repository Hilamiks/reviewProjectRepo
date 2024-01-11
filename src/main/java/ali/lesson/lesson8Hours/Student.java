package ali.lesson.lesson8Hours;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(
			name = "school_id"
	)
	@JsonBackReference
	private School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}

	@OneToOne(
			mappedBy = "student",
			cascade = CascadeType.ALL
	)
	private StudentProfile studentProfile;

	@Column(
			name = "FIRST_NAME",
			length = 20
	)
	private String firstName;

	@Column(
			name = "LAST_NAME",
			length = 20
	)
	private String lastName;

	@Column(
			name = "EMAIL",
			unique = true
	)
	private String email;

	@Column(
			name = "AGE"
	)
	private int age;

	public Student(String firstName, String lastName, String email, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public Student() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
