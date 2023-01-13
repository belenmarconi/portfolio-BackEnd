
package com.miportfolio.backendAP.exception;


public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException (String mensaje){
        super (mensaje);
    }
}
