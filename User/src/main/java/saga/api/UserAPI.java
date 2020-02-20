package saga.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserAPI {

	public static void main(String[] args) {
		SpringApplication.run(UserAPI.class, args);
		System.out.println("User API running");
	}

}
