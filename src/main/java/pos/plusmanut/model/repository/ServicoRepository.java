package pos.plusmanut.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pos.plusmanut.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
