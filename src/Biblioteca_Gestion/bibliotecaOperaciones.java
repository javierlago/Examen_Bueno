package Biblioteca_Gestion;


import Libros.*;
import Prestamos.Prestamos;

import java.util.ArrayList;

public class bibliotecaOperaciones {
   public ArrayList<Biblioteca> BiblotecasUnidas = new ArrayList<>();
   public  void operacionesBiblioteca() {

      ArrayList<Libros> LibrosPontevedra = new ArrayList();
      ArrayList<Prestamos> PrestamosPontevedra = new ArrayList<>();
      Biblioteca Ponteverdra = new Biblioteca("12345", "Pontevedra", "986454091", LibrosPontevedra);
      Ponteverdra.addLibroOcio(new LibrosOcio(PrestamosPontevedra,"123","Pincipito",45F,true));
      Ponteverdra.addLibroTexto(new LibrosTexto("Ciencia","4540","Historia de la ciencia",45F,true));
      BiblotecasUnidas.add(Ponteverdra);
      ArrayList<Libros> LibrosCoruna =new ArrayList();
      ArrayList<Prestamos> PrestamosCoruna = new ArrayList<>();
      Biblioteca Coruna = new Biblioteca("6789", "Coruna", "986454091", LibrosCoruna);
      Ponteverdra.addLibroOcio(new LibrosOcio(PrestamosCoruna,"123","El Quijote",45F,true));
      Ponteverdra.addLibroTexto(new LibrosTexto("Filosofia","4540","Historia de la Filosofia",45F,true));
      BiblotecasUnidas.add(Coruna);


   }



}
