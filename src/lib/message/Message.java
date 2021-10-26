/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.message;
import java.io.Serializable;
import lib.datamodel.User;
/**
 * Esta clase encapsula el objeto user, el método y el mensaje a enviar.
 * @author Adrián Franco.
 */
public class Message implements Serializable{
    
    private User user;
    private enum msg{
    SIGNUP, SIGNIN, OK, INCORRECTUSEREXCEPTION, INCORRECTPASSWORDEXCEPTION,
    INCORRECTEMAILEXCEPTION, USERDONTEXISTEXCEPTION,USEREXISTEXCEPTION,
    PASSWORDDONTMATCHEXCEPTION, CONNECTEXCEPTION, TOOMANYUSERSEXCEPTION;
    }
/**
 * Crea un Mensaje a partir del Usuario recibido.
 * @param user Parametro tipo User importado desde fuera.
 */
    public Message(User user) {
        this.user = user;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}