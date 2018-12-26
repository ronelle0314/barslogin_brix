package bars.login.server.brixter.kim.d.duenas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "bars.login.server.brixter.kim.d.duenas" )
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

