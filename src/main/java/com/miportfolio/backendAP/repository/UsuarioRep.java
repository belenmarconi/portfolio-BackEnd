
package com.miportfolio.backendAP.repository;

import com.miportfolio.backendAP.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRep extends JpaRepository<Usuario,Long> {
    
}
