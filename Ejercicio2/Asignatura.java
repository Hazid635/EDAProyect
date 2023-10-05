package Ejercicio2;

/**
 * @author Equipo 8
 */
public class Asignatura {
    private String clave;
    private String nombre;
    private int creditos;

    public Asignatura(String clave, String nombre, int creditos) {
        this.clave = clave;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    
    public int get_Creditos() {
        return creditos;
    }

    public void set_Creditos(int creditos) {
        this.creditos = creditos;
    }
    
    public String get_Clave() {
        return clave;
    }

    public void set_Clave(String clave) {
        this.clave = clave;
    }

    public String get_Nombre() {
        return nombre;
    }

    public void set_Nombre(String nombre) {
        this.nombre = nombre;
    }

    
}
