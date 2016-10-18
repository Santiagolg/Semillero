package ar.edu.undav.semillero.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="nodo")
public class Nodo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy = "nodo")
	private List<Graduated> graduateds = new ArrayList<>();
	
	@Column(name = "Lugar")
	private String nodoNombre;
	
	@Column(name = "Direccion")
	private String nodoDireccion;
	
	
	public Nodo(){
		
	}

	public void addGraduated(Graduated graduated) {
        this.graduateds.add(graduated);
    }

	public String getNodoNombre() {
		return nodoNombre;
	}

	public String getNodoDireccion() {
		return nodoDireccion;
	}

	public void setNodoNombre(String nodoNombre) {
		this.nodoNombre = nodoNombre;
	}

	public void setNodoDireccion(String nodoDireccion) {
		this.nodoDireccion = nodoDireccion;
	}

	

}
