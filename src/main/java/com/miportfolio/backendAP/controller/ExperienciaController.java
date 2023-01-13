
package com.miportfolio.backendAP.controller;

import com.miportfolio.backendAP.models.Experiencia;
import com.miportfolio.backendAP.services.ExperienciaService;
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
@RequestMapping("/experiencia")
public class ExperienciaController {
    
         @Autowired
    private ExperienciaService experienciaService;
   
   @PostMapping("/agregar")
   public ResponseEntity<Experiencia> agregarExperiencia(@RequestBody Experiencia experiencia){
       Experiencia nuevaExperiencia=experienciaService.agregaExperiencia(experiencia);
       return new ResponseEntity<>(nuevaExperiencia, HttpStatus.CREATED);
   }
   
   @PutMapping("/actualiza")
   public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
       Experiencia actualizaExperiencia=experienciaService.editaExperiencia(experiencia);
       return new ResponseEntity<>(actualizaExperiencia, HttpStatus.OK);
   }
   
    @GetMapping ("/id/{id}")
   public ResponseEntity<Experiencia> dameExperiencia(@PathVariable("id")Long id){
       Experiencia experiencia = experienciaService.buscaExperiencia(id);
       return new ResponseEntity<>(experiencia, HttpStatus.OK);       
   }
   
   @GetMapping ("/getall")
   public ResponseEntity<List<Experiencia>> getallExperiencia(){
       List<Experiencia> experiencia = experienciaService.getAllExperiencia();
       return new ResponseEntity<>(experiencia, HttpStatus.OK);   
   }
         
   @DeleteMapping("/borrar/{id}")
   public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
       experienciaService.borrarExperiencia(id);
       return new ResponseEntity<>(HttpStatus.OK);
   }
    
}
