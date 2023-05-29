package Prestamos;
import Biblioteca_Gestion.Biblioteca;
import Interfaces.Bufferreader;
import Libros.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Gestion_Prestamos implements Bufferreader {

    Biblioteca BibliotecaBusqueda;
    LibrosOcio a;

    Prestamos p;
        public void PrestamoLibros(ArrayList<Biblioteca> ListadoBibliotecas) throws IOException {

        boolean bandera = true;
        do {
            System.out.println("En que biblioteca desea realizar la consulta");
            for (Biblioteca Biblios: ListadoBibliotecas
                 ) {Biblios.mostrarNombre();

            }
            String bibliotecaBuscar = br.readLine();

            for (Biblioteca Biblio : ListadoBibliotecas)
            { if(Biblio.getNombre().compareToIgnoreCase(bibliotecaBuscar)!=0){
                System.err.println("Debes indicar una biblioteca de la lista");
                bandera=false;
                break;
            }else if(Biblio.getNombre().compareToIgnoreCase(bibliotecaBuscar)==0){
                BibliotecaBusqueda=Biblio;
                bandera=true;
            }
            }
        }while (!bandera) ;

        System.out.println("Indique fecha de alta dd/mm/yyyy");
        String dia = br.readLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(dia,formatter);
        System.out.println("Indique DNI");
        String dni = br.readLine();
        String Titulo;
        do {
            System.out.println("Inique titulo del libro");
             Titulo = br.readLine();
             if(esdeOcio(BibliotecaBusqueda.getL(),Titulo)) System.err.println("El libro no esta en esta biblioteca");
        }while(esdeOcio(BibliotecaBusqueda.getL(),Titulo));


            for (Libros LibroAbuscar: BibliotecaBusqueda.getL()
            ) {

                if(LibroAbuscar.getTitulo().compareToIgnoreCase(Titulo)==0){
                a=(LibrosOcio) LibroAbuscar;
               p =new Prestamos(fecha,fecha.plusDays(15),dni);
               a.setEstado(false);
               a.anadirPrestamo(p);
               break;
            }

        }

            System.out.println("has alquilado el "+a.getTitulo()+ " la fecha de devolucion es el dia " + p.getFechaDevolucion());

        }







    public boolean esdeOcio(ArrayList<Libros> Libros,String Titulo){
        boolean esOcio=false;
        for (Libros a: Libros
             ) {if(a instanceof LibrosTexto && a.getTitulo().compareToIgnoreCase(Titulo)==0&& a.isEstado()){
                 esOcio=true;
                 break;
        }

        }
     return  esOcio;
    }


    }
