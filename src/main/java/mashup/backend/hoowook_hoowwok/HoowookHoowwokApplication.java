package mashup.backend.hoowook_hoowwok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HoowookHoowwokApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoowookHoowwokApplication.class, args);
	}

}
