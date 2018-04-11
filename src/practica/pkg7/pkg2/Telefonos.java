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
public class Telefonos  implements Comparable<Telefonos>{

  
    public String tlf;
    
    /**
     * Es el constructor de la clase Teléfonos
     * @param telefono Es el teléfono de tipo String 
     */
    public Telefonos(String telefono){
        this.tlf=telefono;
        }

    /**
     * Devuelve el valor teléfono.
     * @return Nos devuelve teléfono de tipo String
     */
    public String getTlf() {
        return tlf;
    }

    /**
     * Introduce el valor teléfono.
     * @param tlf Teléfono de tipo String que introducimos
     */
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    @Override
    public int compareTo(Telefonos t) {
        return tlf.compareTo(t.tlf);
    }

  
        


}
