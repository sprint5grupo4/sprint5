
package practica.pkg7.pkg2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Es una clase para crear objetos Cliente y guardar sus datos.
 * @author pedroangelalcantaraalcaide
 */
public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private ArrayList<Telefonos> arraytelefonos;
    private ArrayList<Emails> arrayemails;
    
    Cliente(){}
    Cliente(String dni,String nombre,String apellidos,ArrayList<Telefonos> telefonos,ArrayList<Emails> emails){
      this.dni=dni;
      this.nombre=nombre;
      this.apellidos=apellidos;
      this.arraytelefonos=telefonos;
      this.arrayemails=emails;
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

    /**
     *Nos devuelve el Apellido
     * @return Devuelve el apellidos dni como un String
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *Su función es introducir el valor Apellidos
     * @param apellidos es el dato apellidos como tipo de dato String
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *Nos devuelve el Telefono
     * @return Devuelve el telefono dni como un String
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *Su función es introducir el valor  Teléfono
     * @param telefono es el dato telefono como tipo de dato String
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *Nos devuelve el Email
     * @return Devuelve el dato correo como un String
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *Su función es introducir el valor Email
     * @param email es el dato correo como tipo de dato String
     */
    public void setEmail(String email) {
        this.correo = email;
    }

    
    @Override
  public String toString() {
		StringBuffer salida = new StringBuffer();
		salida.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n");
		salida.append("<datos_cliente>" + "\n");
		salida.append("<id>" + this.getDni() + "</id>" + "\n");
		salida.append("<nombre>" + this.nombre + "</nombre>" + "\n");
		salida.append("<apellidos>" + this.apellidos + "</apellidos>" + "\n");
		Comparator<Telefonos> comparadortelfs = Collections.reverseOrder();
                
		Collections.sort(arraytelefonos,comparadortelfs);

		salida.append("<telefonos" + " total=\"" + arraytelefonos.size() + "\">" + "\n");
		for (int i = 0; i < arraytelefonos.size(); i++) {

			salida.append("<telefono>" + this.arraytelefonos.get(i).getTlf() + "</telefono>" + "\n");
		}

		salida.append("</telefonos>" + "\n");
		salida.append("<mails>" + "\n");
		for (int a = 0; a < arrayemails.size(); a++) {
			salida.append("<mail>" + this.arrayemails.get(a).getEmail() + "</mail>" + "\n");
		}
		salida.append("</mails>" + "\n");
		salida.append("</datos_cliente>");
		return salida.toString();

	}

  
}