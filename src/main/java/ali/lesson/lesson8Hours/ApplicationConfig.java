package ali.lesson.lesson8Hours;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	MyClass myClass() {
		return new MyClass();
	}
}
