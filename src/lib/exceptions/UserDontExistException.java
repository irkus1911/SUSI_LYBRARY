/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

/**
 *Esta clase maneja la excepcion de que el usuario introducido en el login no 
 * exista
 * @author Irkus de la Fuente
 */
public class UserDontExistException extends Exception {
    public UserDontExistException(String mensaje){
        super(mensaje);
    }
}
