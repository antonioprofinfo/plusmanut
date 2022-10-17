package pos.plusmanut.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.plusmanut.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
