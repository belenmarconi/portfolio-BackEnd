
package com.miportfolio.backendAP.controller;

import com.miportfolio.backendAP.models.Usuario;
import com.miportfolio.backendAP.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
   @Autowired
    private UsuarioService usuarioService;
   
   @GetMapping ("/id/{id}")
   public ResponseEntity<Usuario> dameUsuario(@PathVariable("id")Long id){
       Usuario usuario = usuarioService.buscaUsuario(id);
       return new ResponseEntity<>(usuario, HttpStatus.OK);       
   }
   
   @PutMapping("/actualiza")
   public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
       Usuario actualizaUsuario=usuarioService.editaUsuario(usuario);
       return new ResponseEntity<>(actualizaUsuario, HttpStatus.OK);
   }
    
}
