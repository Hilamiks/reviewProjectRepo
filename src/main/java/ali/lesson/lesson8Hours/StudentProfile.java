package ali.lesson.lesson8Hours;

import jakarta.persistence.*;

@Entity
public class StudentProfile {

	@Id
	@GeneratedValue
	private Long id;

	private String bio;

	@OneToOne
	@JoinColumn(
			name = "student_id"
	)
	private Student student;

	public StudentProfile(String bio) {
		this.bio = bio;
	}

	public StudentProfile() {
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
}
