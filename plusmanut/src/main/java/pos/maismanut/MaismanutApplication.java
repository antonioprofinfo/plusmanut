package pos.maismanut;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import pos.maismanut.model.entity.Cliente;
import pos.maismanut.model.repository.ClienteRepository;


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
