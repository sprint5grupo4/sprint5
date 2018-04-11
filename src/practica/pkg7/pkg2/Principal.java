package practica.pkg7.pkg2;

import java.io.File;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pedroangelalcantaraalcaide
 * @author oscarsomozaperdigon
 * @author isabelroldancordoba
 */
public class Principal {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String DatosCliente = crearStringDatosCliente();
        File fichero = new File(DatosCliente);

        Cliente nuevocliente = new Cliente();

        String cliente1 = "X12345678F,\"nombre\",\"apellidos\",+(82)12345678, 612345678,test@TEST.com,(91)23456789,eee@eeeeee,44229\n"
                + ",prueba@prueba.com";

        Formato formatear = new Formato();
        String datos= formatear.formatearCadena(cliente1);

        try {

            FileWriter escribir = new FileWriter(DatosCliente, true);

            escribir.write(datos);

            escribir.close();
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }

        

    }

    private static String crearStringDatosCliente() {
        // TODO code application logic here
        String DatosCliente = "datos_cliente.xml";
        return DatosCliente;
    }

}
