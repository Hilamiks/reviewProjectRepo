package ali.lesson.lesson8Hours;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {

	@Bean("devBean")
	@Profile("dev")
	MyClass myClass() {
		return new MyClass("Dev Bean");
	}

	@Bean("testBean")
	@Profile("test")
	MyClass mySecondClass() {
		return new MyClass("Test Bean");
	}

	@Bean
	@Profile("custom")
	public MyClass myThirdClass() {
		return new MyClass("Primary Bean");
	}
}
