/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

/**
 *Esta clase controla la excepcion de que en el registro el usuario introducido
 * ya exista
 * @author Irkus de la Fuente
 */
public class UserExistException extends Exception {
    public UserExistException(String mensaje){
        super(mensaje);
    }
}
