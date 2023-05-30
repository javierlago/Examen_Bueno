import Biblioteca_Gestion.*;
import Prestamos.Gestion_Prestamos;
import com.thoughtworks.xstream.XStream;

import java.io.IOException;

import static Create_Files.newFile.createXMLfile;
import static Create_XML.Leer_Escribir_Xstream.writeXML;

public class Menu_Principal {

    public static void main(String[] args) throws IOException {
        XStream reader = new XStream();
        bibliotecaOperaciones bo = new bibliotecaOperaciones();
        Gestion_Prestamos gp = new Gestion_Prestamos();
       bo.operacionesBiblioteca();
       //gp.PrestamoLibros(bo.BiblotecasUnidas);
            writeXML(reader,bo.BiblotecasUnidas,createXMLfile("Bibliotecas"));

    }




}
