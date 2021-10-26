/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

/**
 *Esta clase maneja la excepcion que controla el formato del usuario que no 
 * tenga mas de 255 caracteres
 * @author Irkus de la Fuente
 */
public class IncorrectUserException extends Exception {
    public IncorrectUserException(String message){
        super(message);
    }
}
