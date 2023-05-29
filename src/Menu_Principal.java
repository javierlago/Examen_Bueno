import Biblioteca_Gestion.*;
import Prestamos.Gestion_Prestamos;

import java.io.IOException;

public class Menu_Principal {

    public static void main(String[] args) throws IOException {
        bibliotecaOperaciones bo = new bibliotecaOperaciones();
        Gestion_Prestamos gp = new Gestion_Prestamos();
       bo.operacionesBiblioteca();
       gp.PrestamoLibros(bo.BiblotecasUnidas);








    }
}
