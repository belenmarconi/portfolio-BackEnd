package com.miportfolio.backendAP.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
   
    private Long idExp;
    private String puestoExp;
    private String empresaExp;
    private String fechaExp;
    private String detalleExp;
    private String imagenExp;
    
    
}
