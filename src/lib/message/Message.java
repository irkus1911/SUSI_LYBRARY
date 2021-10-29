/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.message;
import java.io.Serializable;
import lib.dataModel.User;
/**
 * Esta clase encapsula el objeto user, el método y el mensaje a enviar.
 * @author Adrián Franco.
 */
public class Message implements Serializable{
    
    private User user;
    private Msg msg;

    public Msg getMsg() {
        return msg;
    }

    public void setMsg(Msg msg) {
        this.msg = msg;
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