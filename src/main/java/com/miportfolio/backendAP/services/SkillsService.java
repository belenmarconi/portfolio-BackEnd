
package com.miportfolio.backendAP.services;

import com.miportfolio.backendAP.models.Skills;
import com.miportfolio.backendAP.repository.SkillsRep;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {
    
     
    private final SkillsRep skillsRep;
    
    @Autowired
    public SkillsService(SkillsRep skillsRep){
        this.skillsRep = skillsRep;
    }
    
    public Skills agregaSkills(Skills skills){
        return skillsRep.save(skills);
    }
    
    public List<Skills> getAllSkills(){
        return skillsRep.findAll();
    }
    
    public Skills buscaSkills(Long id){
        Skills skills = skillsRep.findById(id).orElse(null);
        return skills;
    }
    
    public Skills editaSkills (Skills skills){
        return skillsRep.save(skills);
    }
    
    public void borrarSkills (Long id){
        skillsRep.deleteById(id);
    }
    
    
}
