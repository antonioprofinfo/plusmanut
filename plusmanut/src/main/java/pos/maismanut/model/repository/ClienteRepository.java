package pos.maismanut.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.maismanut.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
