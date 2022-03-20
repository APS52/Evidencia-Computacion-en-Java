package EvidenciaCJ;

public class Usuario {

    private String nombre;
    private String password;

    public Usuario(String nom, String pass) {
        nombre = nom;
        password = pass;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Usuario) {
            Usuario otroAdmin = (Usuario)objeto;
            //Se ve si coinciden nombre y password.
            if (nombre.equals(otroAdmin.nombre) && password.equals(otroAdmin.password))
                return true; //Coinciden.
            else
                return false;//Algo no coincide.
        }
        else
            return false;
    }

}
