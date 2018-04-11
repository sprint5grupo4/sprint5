
package practica.pkg7.pkg2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Es una clase que sirve para dar formato a una cadena de tipo String con los datos de un cliente y exportarlos en un string con formato de XML
 * @author pedroangelalcantaraalcaide
 */
public class Formateadora {
    private String cadena;
    private ArrayList<Telefonos> arraytelefonos;
    private ArrayList<Emails> arrayemails;
    
    /**
     *
     */
    public Formateadora(){
    arraytelefonos= new ArrayList<Telefonos>();
    arrayemails= new ArrayList<Emails>();
    }
    
    /**
     *
     * @param cadena Es la cadena que contiene los datos de cliente
     * @return Devuelve un toString de la clase Cliente con todos los datos del mismo ya con el formato correcto de XML.
     */
    public String formatearCadena(String cadena){
    
        String[] partes = cadena.split(",");
        String dni = partes[0];
        String nombre = partes[1];
        String apellidos = partes[2];

        

        for (int i = 3; i < partes.length; i++) {

            
            Pattern patronEmail= Pattern.compile("^[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{2,3})$");
            
            Pattern patronTelf = Pattern.compile("[\\s]*\\+?(\\([\\d]{1,3}\\))?[\\d]{8,9}+[\\s]*");
            

            Matcher email = patronEmail.matcher(partes[i]);
            Matcher telefono = patronTelf.matcher(partes[i]);

            if (!email.matches()){

                if (!telefono.matches()) {
                    System.err.println("No es un dato válido: " + partes[i]);
                } else {
                    
                    //System.out.println("Télefono:"+ partes[i]);
                    Telefonos t= new Telefonos(partes[i]);
                    
                    arraytelefonos.add(t);
                   
                }

            } else {
                //System.out.println("email=" + partes[i]);
                Emails e= new Emails(partes[i]);
                e.setEmail(partes[i]);
                arrayemails.add(e);

            }

        }
        
        
        
        Cliente nuevoCliente= new Cliente(dni,nombre,apellidos,arraytelefonos,arrayemails);
        
        return nuevoCliente.toString();
    }
    
   
    
}
