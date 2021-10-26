/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.exceptions;

import java.sql.SQLException;

/**
 *Esta clase maneja la excepcion de conexcion a base de datos
 * @author Irkus de la Fuente
 */
public class ConnectException extends SQLException{
    public ConnectException(String mensaje){
        super(mensaje);
    }
}
