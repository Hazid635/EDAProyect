package Ejercicio2;

/**
 * @author Equipo 8
 */
public class Alumno {

    private String Nombre;
    private String numeroCuenta;

    public Alumno(String Nombre, String numeroCuenta) {
        this.Nombre = Nombre;
        this.numeroCuenta = numeroCuenta;
    }

    public String get_Nombre() {
        return Nombre;
    }

    public void set_Nombre(String nombre) {
        this.Nombre = nombre;
    }

    public String get_NumeroCuenta() {
        return numeroCuenta;
    }

    public void set_NumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


}

