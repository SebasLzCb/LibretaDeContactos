package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar() { }

    public Familiar(String cedula, String nombre, String apellido, String direccion,
                    String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(cedula, nombre, apellido);
        setDireccion(direccion);
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double calcularEdad() {
        if (fechaDeNacimiento == null) {
            return -1;
        }

        Calendar hoy = Calendar.getInstance();
        int anioActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH);
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);

        int anioNacimiento = fechaDeNacimiento.get(Calendar.YEAR);
        int mesNacimiento = fechaDeNacimiento.get(Calendar.MONTH);
        int diaNacimiento = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);

        int edad = anioActual - anioNacimiento;

        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\n Parentesco: " + parentesco +
                ",\n Tipo de Sangre: " + tipoDeSangre +
                ",\n Edad: " + calcularEdad() + " años";
    }
}
