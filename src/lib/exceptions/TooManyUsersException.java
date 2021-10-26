/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

/**
 *Esta clase maneja la excepcion que no haya mas de 10 conexiones a la vez
 * @author Irkus de la Fuente 
 */
public class TooManyUsersException extends Exception {
    public TooManyUsersException(String message){
        super(message);
    }
}
