
package com.miportfolio.backendAP.services;

import com.miportfolio.backendAP.models.Usuario;
import com.miportfolio.backendAP.repository.UsuarioRep;
import com.miportfolio.backendAP.exception.UserNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {
    
    
    private final UsuarioRep usuarioRep;
    
    @Autowired
    public UsuarioService(UsuarioRep usuarioRep){
        this.usuarioRep = usuarioRep;
    }
    
    public Usuario agregaUsuario(Usuario usuario){
        return usuarioRep.save(usuario);
    }
    
    public List<Usuario> getAllUsuario(){
        return usuarioRep.findAll();
    }
    
    public Usuario buscaUsuario(Long id){
        return usuarioRep.findById(id).orElseThrow( ()-> new UserNotFoundException ("Usuario no encontrado") );
        
    }
    
    public Usuario editaUsuario (Usuario usuario){
        return usuarioRep.save(usuario);
    }
    
    public void borrarUsuario (Long id){
        usuarioRep.deleteById(id);
    }
    
}
