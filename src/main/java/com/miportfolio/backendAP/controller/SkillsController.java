
package com.miportfolio.backendAP.controller;

import com.miportfolio.backendAP.models.Skills;
import com.miportfolio.backendAP.services.SkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    
             @Autowired
    private SkillsService skillsService;
   
   @PostMapping("/agregar")
   public ResponseEntity<Skills> agregarSkills(@RequestBody Skills skills){
       Skills nuevaSkills=skillsService.agregaSkills(skills);
       return new ResponseEntity<>(nuevaSkills, HttpStatus.CREATED);
   }
   
   @PutMapping("/actualiza")
   public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
       Skills actualizaSkills=skillsService.editaSkills(skills);
       return new ResponseEntity<>(actualizaSkills, HttpStatus.OK);
   }
   
    @GetMapping ("/id/{id}")
   public ResponseEntity<Skills> dameSkills(@PathVariable("id")Long id){
       Skills skills = skillsService.buscaSkills(id);
       return new ResponseEntity<>(skills, HttpStatus.OK);       
   }
   
   @GetMapping ("/getall")
   public ResponseEntity<List<Skills>> getallSkills(){
       List<Skills> skills = skillsService.getAllSkills();
       return new ResponseEntity<>(skills, HttpStatus.OK);   
   }
         
   @DeleteMapping("/borrar/{id}")
   public ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
       skillsService.borrarSkills(id);
       return new ResponseEntity<>(HttpStatus.OK);
   }
}
