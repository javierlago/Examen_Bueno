package Create_XML;


import Biblioteca_Gestion.*;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Leer_Escribir_Xstream {
    //TODO: Se debe de cambiar el parametro objeto por el tipo de dato que deseemos grabar
    public static void writeXML(XStream xstream, ArrayList<Biblioteca> Biblio, File fileName ) throws FileNotFoundException {
        xstream.toXML(Biblio,new FileOutputStream(fileName));
    }

    public static void readXML(XStream xstream,File fileName){
    //TODO: Cambiar "objeto" por la clase que deseamos cambiar//
        ArrayList<Biblioteca> b;
        try {
             b = (ArrayList<Biblioteca>) xstream.fromXML(fileName);
            for (Biblioteca bi: b
            ) {
                System.out.println(bi);

            }
        }catch (Exception e){

        }

        }













}
