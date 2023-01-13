
package com.miportfolio.backendAP.services;

import com.miportfolio.backendAP.models.Experiencia;
import com.miportfolio.backendAP.repository.ExperienciaRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    
     
    private final ExperienciaRep experienciaRep;
    
    @Autowired
    public ExperienciaService(ExperienciaRep experienciaRep){
        this.experienciaRep = experienciaRep;
    }
    
    public Experiencia agregaExperiencia(Experiencia experiencia){
        return experienciaRep.save(experiencia);
    }
    
    public List<Experiencia> getAllExperiencia(){
        return experienciaRep.findAll();
    }
    
    public Experiencia buscaExperiencia(Long id){
        Experiencia experiencia = experienciaRep.findById(id).orElse(null);
        return experiencia;
    }
    
    public Experiencia editaExperiencia (Experiencia experiencia){
        return experienciaRep.save(experiencia);
    }
    
    public void borrarExperiencia (Long id){
        experienciaRep.deleteById(id);
    }
    
    
}
