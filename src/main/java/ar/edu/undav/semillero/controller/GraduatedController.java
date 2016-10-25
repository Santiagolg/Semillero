package ar.edu.undav.semillero.controller;
import org.springframework.beans.factory.annotation.Autowired;
/******************************************************
 * Al runnear esto, si entro a localhost:8080/saveGraduated guardo un graduado en la DB semillero
 *****************************************************/
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import ar.edu.undav.semillero.domain.entity.Graduated;
import ar.edu.undav.semillero.domain.repository.GraduatedRepository;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/Graduated")
public class GraduatedController {

   @Autowired
    private GraduatedRepository graduatedRepository;
	
    
	@RequestMapping(method=RequestMethod.POST)
    Graduated saveGraduated() {
    	Graduated graduated = new Graduated("Santi");
        graduatedRepository.save(graduated);
        return graduated;
    }

    

}