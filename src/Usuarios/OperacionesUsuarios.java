package Usuarios;

import java.util.ArrayList;

public class OperacionesUsuarios {
    public ArrayList<Usuarios> ListadoUsuarios =new ArrayList<>();

    public void anadirUsuario(){
        ListadoUsuarios.add(new Usuarios(1,"3615789","Javier","Lago","Amoedo","Chapela","9864544091",false));
        ListadoUsuarios.add(new Usuarios(1,"3615789","Manuel","Lago","Amoedo","Chapela","9864544091",false));
        ListadoUsuarios.add(new Usuarios(1,"3615789","Pepe","Lago","Amoedo","Chapela","9864544091",false));


    }
    public Usuarios getUsuer(String userName){
        Usuarios user = null;
        for (Usuarios u: ListadoUsuarios
             ) {if(u.getNombre().compareToIgnoreCase(userName)==0){
                 user=u;
        }

        }

       return  user;
    }

    public boolean tieneSancion(Usuarios user){
        return user.isSancion();
    }


}
