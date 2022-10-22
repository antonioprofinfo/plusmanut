package pos.plusmanut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController


@SpringBootApplication
public class MaismanutApplication {

	/*@Bean
	public CommandLineRunner run(@Autowired ClienteRepository repository){
		return args -> {
			Cliente cliente = Cliente.builder().cpf("00000000000").nome("Antonio").build();
			repository.save(cliente);
		};
	}*/




	public static void main(String[] args) {
		SpringApplication.run(MaismanutApplication.class, args);
	}

}
