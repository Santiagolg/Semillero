package ar.edu.undav.semillero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.undav.semillero.domain.entity.Graduated;
import ar.edu.undav.semillero.domain.repository.GraduatedRepository;

@Service
public class GraduatedService {
	
	@Autowired
    private GraduatedRepository graduatedRepository;
	
	public void save(Graduated graduated) {
        graduatedRepository.save(graduated);
    }
}
