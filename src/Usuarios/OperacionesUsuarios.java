package Usuarios;

import java.util.ArrayList;

public class OperacionesUsuarios {
    public ArrayList<Usuarios> ListadoUsuarios =new ArrayList<>();

    public void anadirUsuarioAutomatica(){
        ListadoUsuarios.add(new Usuarios(0,"3615789","Javier","Lago","Amoedo","Chapela","9864544091",false));
        ListadoUsuarios.add(new Usuarios(1,"3615780","Manuel","Lago","Amoedo","Chapela","9864544091",false));
        ListadoUsuarios.add(new Usuarios(2,"3615781","Pepe","Lago","Amoedo","Chapela","9864544091",false));

    }






    public Usuarios getUsuerbyDNI(String userName){
        Usuarios user = null;
        for (Usuarios u: ListadoUsuarios
             ) {if(u.getNombre().compareToIgnoreCase(userName)==0){
                 user=u;
        }
        }
        return  user;
    }

public Usuarios findByDni(String dni){
        Usuarios a = null;
        boolean flag=false;
     do{
    for (Usuarios user: ListadoUsuarios
         ) {
        if(user.getDniLector().compareToIgnoreCase(dni)==0){
            a=user;
            break;
        } else if(a==null)  {
            System.err.println("El usuario que busca no existe");
        }
    }
     }while(flag);
     return a;
    }

}
