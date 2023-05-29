package Prestamos;
import Biblioteca_Gestion.Biblioteca;
import Interfaces.Bufferreader;
import Libros.Libros;

import java.io.IOException;
import java.util.ArrayList;

public class Gestion_Prestamos implements Bufferreader {
    public void PrestamoLibros(ArrayList<Biblioteca> ListadoBibliotecas) throws IOException {
        Biblioteca BibliotecaBusqueda = new Biblioteca();
        boolean bandera = true;
        do {
            System.out.println("En que biblioteca desea realizar la consulta");
            for (Biblioteca Biblios: ListadoBibliotecas
                 ) {Biblios.mostrarNombre();

            }
            String bibliotecaBuscar = br.readLine();

            for (Biblioteca Biblio : ListadoBibliotecas)
            { if(Biblio.getNombre()!=bibliotecaBuscar){
                System.out.println("Debes indicar una biblioteca de la lista");
                bandera=false;
                break;
            }else if(Biblio.getNombre().compareToIgnoreCase(bibliotecaBuscar)==0){
                BibliotecaBusqueda=Biblio;
                bandera=true;
            }
            }
        }while (bandera = false) ;


        for (Libros Bib: BibliotecaBusqueda.getL()
             ) {

        }


        }
    }
