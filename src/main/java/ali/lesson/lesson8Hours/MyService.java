package ali.lesson.lesson8Hours;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
//@PropertySource("classpath:custom.properties")
public class MyService {

	private final MyClass myClass;

	@Value("${my.custom.property}")
	private String customProperty;

	public MyService(
			MyClass myClass
	) {
		this.myClass = myClass;
	}

	public String tellStory() {
		return "property is : " + customProperty + "the dependency is saying : " + myClass.sayHello();
	}

}
