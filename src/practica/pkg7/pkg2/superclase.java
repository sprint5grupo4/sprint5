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
public class superclase {
    
    /**
     *
     */
    protected String dni;

    /**
     *
     */
    protected String nombre;

    /**
     *
     */
    public superclase() {
    }

    /**
     *Nos devuelve el DNI
     * @return Devuelve el dato dni como un String
     */
    public String getDni() {
        return dni;
    }

    /**
     * Su función es introducir el valor dni
     * @param dni es el dato dni como tipo de dato String
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     *Nos devuelve el Nombre
     * @return Devuelve el nombre dni como un String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *Su función es introducir el valor Nombre
     * @param nombre es el dato nombre como tipo de dato String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
