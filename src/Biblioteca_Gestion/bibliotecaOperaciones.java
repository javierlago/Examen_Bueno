package Biblioteca_Gestion;


import Libros.*;
import Prestamos.Prestamos;

import java.util.ArrayList;

public class bibliotecaOperaciones {
   private ArrayList<Biblioteca> BiblotecasUnidas = new ArrayList<>();
   public  void operacionesBiblioteca() {

      ArrayList<Libros> LibrosPontevedra = new ArrayList();
      ArrayList<Prestamos> PrestamosPontevedra = new ArrayList<>();
      Biblioteca Ponteverdra = new Biblioteca("12345", "Pontevedra", "986454091", LibrosPontevedra);
      Ponteverdra.addLibroOcio(new LibrosOcio(PrestamosPontevedra,"123","Pinncipito",45F,true));
      Ponteverdra.addLibroTexto(new LibrosTexto("Ciencia","4540","Historia de la ciencia",45F,true));
      BiblotecasUnidas.add(Ponteverdra);


   }


}
