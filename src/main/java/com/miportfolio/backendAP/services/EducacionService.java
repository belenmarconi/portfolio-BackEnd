
package com.miportfolio.backendAP.services;

import com.miportfolio.backendAP.models.Educacion;
import com.miportfolio.backendAP.repository.EducacionRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
    private final EducacionRep educacionRep;
    
    @Autowired
    public EducacionService (EducacionRep educacionRep){
        this.educacionRep = educacionRep;
    }
    
    public Educacion agregaEduc(Educacion educ){
        return educacionRep.save(educ);
    }
    
    public List<Educacion> getAllEduc(){
        return educacionRep.findAll();
    }
    
    public Educacion buscaEduc(Long id){
        Educacion educ = educacionRep.findById(id).orElse(null);
        return educ;
    }
    
    public Educacion editaEduc (Educacion educ){
        return educacionRep.save(educ);
    }
    
    public void borrarEduc (Long id){
        educacionRep.deleteById(id);
    }
    
}
