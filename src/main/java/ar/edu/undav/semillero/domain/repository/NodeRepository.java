package ar.edu.undav.semillero.domain.repository;

import ar.edu.undav.semillero.domain.entity.Nodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NodeRepository extends JpaRepository<Nodo, Long>{

}
