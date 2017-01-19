package evolution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	@RequestMapping(value = "/anyMethod", method = RequestMethod.GET)
	public void anyMethod() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
