package ar.edu.undav.semillero.domain.repository;


import ar.edu.undav.semillero.domain.entity.Company;
import ar.edu.undav.semillero.domain.entity.Graduated;

import ar.edu.undav.semillero.domain.entity.Interview;
import ar.edu.undav.semillero.domain.entity.Nodo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.Date;

/**
 * Juan Lagostena on 12/10/16
 * jlagostena@bitsense.com.ar
 * .
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GraduatedRepositoryTest {

    @Autowired
    private GraduatedRepository graduatedRepository;

    @Autowired
    private CompanyRepository companyRepository;
    
    @Autowired
    private InterviewRepository interviewRepository;
    
    @Autowired
    private NodeRepository nodeRepository;

    @Test
    public void testSave() {
    	
        Graduated graduated = new Graduated("Santi");
        Company company = new Company("company", "jorge");
        companyRepository.save(company);
        
        Nodo node= new Nodo();
        node.addGraduated(graduated);
        node.setNodoDireccion("CalleFalsa123");
        node.setNodoNombre("Banfield");
        nodeRepository.save(node);
        
        graduated.setNodo(node);
        graduated.addInterview(new Interview(graduated, company, new Date(), "no comments"));
        
        graduatedRepository.save(graduated);
    }


}