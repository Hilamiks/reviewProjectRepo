package ali.lesson.lesson8Hours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class Lesson8HoursApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(Lesson8HoursApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","custom"));
		var ctx = app.run(args);

//		OLD WAY
//		MyClass myClass = new MyClass();
//		System.out.println(myClass.sayHello());
//
		//BEAN WAY
		MyService myService = ctx.getBean(MyService.class);
		System.out.println(myService.tellStory());
	}
}
