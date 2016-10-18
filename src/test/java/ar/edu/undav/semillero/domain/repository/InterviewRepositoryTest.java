package ar.edu.undav.semillero.domain.repository;


import java.util.Date;

import ar.edu.undav.semillero.domain.entity.Company;
import ar.edu.undav.semillero.domain.entity.Graduated;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ar.edu.undav.semillero.domain.entity.Interview;


@SpringBootTest
@RunWith(SpringRunner.class)
public class InterviewRepositoryTest {
	
	@Autowired
    private GraduatedRepository graduatedRepository;

    @Autowired
    private CompanyRepository companyRepository;
    
    @Autowired
    private InterviewRepository interviewRepository;
    
    @Test
    public void testSave() {
    	Graduated graduated = new Graduated("Santi");
        Company company = new Company("company", "jorge");
        companyRepository.save(company);
        graduatedRepository.save(graduated);
        Interview entrevista = new Interview(new Graduated(), new Company(), new Date() ,"Hay que contratarlo al toque");
        interviewRepository.save(entrevista);
    }


}