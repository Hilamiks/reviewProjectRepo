package ali.lesson.lesson8Hours;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

	@Bean
	@Qualifier("bean1")
	MyClass myClass() {
		return new MyClass("First Bean");
	}

	@Bean
	@Qualifier("bean2")
	MyClass mySecondClass() {
		return new MyClass("Second Bean");
	}

	@Bean
	@Primary
	public MyClass myThirdClass() {
		return new MyClass("Third Bean");
	}
}
