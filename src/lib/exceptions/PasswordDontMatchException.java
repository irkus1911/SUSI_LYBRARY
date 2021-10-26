/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

/**
 *Esta clase maneja la excepcion de que las contraseñas no coincidan tanto 
 * registro como login contra base de datos
 * @author Irkus de la Fuente
 */
public class PasswordDontMatchException extends Exception {
    public PasswordDontMatchException(String message){
        super(message);
    }
}
