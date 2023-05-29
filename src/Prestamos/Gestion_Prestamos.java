package Prestamos;
import Biblioteca_Gestion.Biblioteca;
import Interfaces.Bufferreader;
import Libros.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Gestion_Prestamos implements Bufferreader {
    ArrayList<Prestamos> listadoPrestamo;
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

        System.out.println("Indique flecha de alta");
        LocalDate dia= LocalDate.parse(br.readLine());
        System.out.println("Indique DNI");
        String dni = br.readLine();
        String Titulo;
        do {
            System.out.println("Inique titulo del libro");
             Titulo = br.readLine();
        }while(esdeOcio(BibliotecaBusqueda.getL(),Titulo));

        for (Libros Libro: BibliotecaBusqueda.getL()
             )
        {
            LibrosOcio a = new LibrosOcio();
            if(Libro.getTitulo().compareToIgnoreCase(Titulo)==0){
            Libro = a;
          Prestamos p = new Prestamos(dia,dia.plusDays(15),dni);
          a.anadirPrestamo(p);


            }

        }



        }



    public boolean esdeOcio(ArrayList<Libros> Libros,String Titulo){
        boolean esOcio=false;
        for (Libros a: Libros
             ) {if(a instanceof LibrosTexto && a.getTitulo().compareToIgnoreCase(Titulo)==0){
                 esOcio=true;
                 break;
        }else System.err.println("El libro que solicita no se encuentra en la lista de libros disponibles ");

        }
     return  esOcio;
    }


    }
