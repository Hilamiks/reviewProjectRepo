package ali.lesson.lesson8Hours;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean("myBean")
	MyClass myClass() {
		return new MyClass("First Bean");
	}
}
