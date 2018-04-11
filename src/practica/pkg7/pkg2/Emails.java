/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg7.pkg2;

/**
 *
 * @author pedroangelalcantaraalcaide
 */
public class Emails   {

    public String email;
    
    /**
     * Este es el constructor de la clase Email
     * @param email Es el email que introducimos de tipo String
     */
    public Emails(String email){
        this.email=email;
        }

    /**
     *Devuelve el valor de Email
     * @return Devuelve el valor de Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Introduce el valor de Email
     * @param email Es el email de tipo String que introducimos
     */
    public void setEmail(String email) {
        this.email = email;
    }
        
    

}