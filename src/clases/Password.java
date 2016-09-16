package clases;

/**
 *
 * @author baltamar
 */
public class Password {

    private String longitud;
    private String contraseña;

    public Password(String longitud, String contraseña) {
        this.longitud = longitud;
        this.contraseña = contraseña;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Password NivelDeSeguridad() {
        Password p;
        String longitud;
        String contraseña;

        longitud = this.longitud;
        contraseña = this.contraseña;

        if (Integer.parseInt(longitud) >= 1 && Integer.parseInt(longitud) < 6) {
            longitud = "DEBIL";
        } else if (Integer.parseInt(longitud) == 0) {
            longitud = "";
        } else {
            longitud = "FUERTE";
        }
        p = new Password(longitud, contraseña);
        return p;
    }

    public void CambioDeContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
