package ali.lesson.lesson8Hours;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lesson8HoursApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(Lesson8HoursApplication.class, args);

//		OLD WAY
//		MyClass myClass = new MyClass();
//		System.out.println(myClass.sayHello());
//
		//BEAN WAY
		MyClass myClass = ctx.getBean(MyClass.class);
		System.out.println(myClass.sayHello());

	}

	//@Bean
	public MyClass myClass() {
		return new MyClass();
	}

}
