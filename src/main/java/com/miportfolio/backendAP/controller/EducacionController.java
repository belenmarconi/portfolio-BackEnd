
package com.miportfolio.backendAP.controller;

import com.miportfolio.backendAP.models.Educacion;
import com.miportfolio.backendAP.services.EducacionService;
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
@RequestMapping("/educacion")
public class EducacionController {
    
     @Autowired
    private EducacionService educacionService;
   
   @PostMapping("/agregar")
   public ResponseEntity<Educacion> agregarEducacion(@RequestBody Educacion educacion){
       Educacion nuevaEduc=educacionService.agregaEduc(educacion);
       return new ResponseEntity<>(nuevaEduc, HttpStatus.CREATED);
   }
   
   @PutMapping("/actualiza")
   public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
       Educacion actualizaEducacion=educacionService.editaEduc(educacion);
       return new ResponseEntity<>(actualizaEducacion, HttpStatus.OK);
   }
   
    @GetMapping ("/id/{id}")
   public ResponseEntity<Educacion> dameEducacion(@PathVariable("id")Long id){
       Educacion educacion = educacionService.buscaEduc(id);
       return new ResponseEntity<>(educacion, HttpStatus.OK);       
   }
   
   @GetMapping ("/getall")
   public ResponseEntity<List<Educacion>> getallEducacion(){
       List<Educacion> educacion = educacionService.getAllEduc();
       return new ResponseEntity<>(educacion, HttpStatus.OK);   
   }
         
   @DeleteMapping("/borrar/{id}")
   public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
       educacionService.borrarEduc(id);
       return new ResponseEntity<>(HttpStatus.OK);
   }
   
}
