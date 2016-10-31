package ar.edu.undav.semillero.domain.repository;


import ar.edu.undav.semillero.domain.entity.Graduated;

import ar.edu.undav.semillero.domain.entity.Nodo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;


@SpringBootTest
@RunWith(SpringRunner.class)
public class NodeRepositoryTest {
	
	@Autowired
    private GraduatedRepository graduatedRepository;
	
	@Autowired
    private NodeRepository nodeRepository;
    
	
    @Test
    public void testSave() {
        Graduated graduated = new Graduated("Santi");
        Nodo nodo= new Nodo();
        
        nodo.setNodoDireccion("CalleFalsa123");
        nodo.setNodoNombre("Banfield");

        nodo.addGraduated(graduated);

        nodeRepository.save(nodo);
    }			


}
