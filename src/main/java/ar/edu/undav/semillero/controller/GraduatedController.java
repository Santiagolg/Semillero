package ar.edu.undav.semillero.controller;
import ar.edu.undav.semillero.domain.entity.Graduated;
import ar.edu.undav.semillero.domain.repository.GraduatedRepository;
import ar.edu.undav.semillero.services.GraduatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/graduated")
public class GraduatedController {

   @Autowired
    private GraduatedRepository graduatedRepository;
	
    
	@RequestMapping(value="", method=RequestMethod.POST)
    public String saveGraduated(@RequestParam(value="name")String name){
    	Graduated graduated = new Graduated(name);
        graduatedRepository.save(graduated);
        return "Graduado: "+name+" agregado";
    }

   
}