package com.miportfolio.backendAP.models;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable=false, updatable=false)  
   
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String sobremi;
    private String foto;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idEduc" )
    private List<Educacion> educLista;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idExp" )
    private List<Experiencia> expLista;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="idSkill" )
    private List<Skills> skillsLista;
    
    
}
