package pos.maismanut.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.maismanut.model.entity.Cliente;
import pos.maismanut.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
