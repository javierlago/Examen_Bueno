import Biblioteca_Gestion.*;
import Prestamos.Gestion_Prestamos;

public class Menu_Principal {

    public static void main(String[] args) {
        bibliotecaOperaciones bo = new bibliotecaOperaciones();
        Gestion_Prestamos gp = new Gestion_Prestamos();
       bo.operacionesBiblioteca();
       gp.PrestamoLibros();








    }
}
