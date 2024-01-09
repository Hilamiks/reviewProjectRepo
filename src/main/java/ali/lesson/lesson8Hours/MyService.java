package ali.lesson.lesson8Hours;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	private final MyClass myClass;

	public MyService(
			//@Qualifier("bean1")
			MyClass myClass
	) {
		this.myClass = myClass;
	}

	public String tellStory() {
		return "the dependency is saying : " + myClass.sayHello();
	}

}
