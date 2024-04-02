package br.edu.ifsp.pw3.oficina.repositories;

import br.edu.ifsp.pw3.oficina.models.Conserto;
import br.edu.ifsp.pw3.oficina.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsertoRepository extends JpaRepository<Conserto, Long> {
}


