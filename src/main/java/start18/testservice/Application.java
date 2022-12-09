package start18.testservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {
	// 환경설정 push를 위한 commitㅎ

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
