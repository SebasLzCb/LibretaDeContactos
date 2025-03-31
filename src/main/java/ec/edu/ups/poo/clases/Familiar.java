package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    // Constructor vacío
    public Familiar() { }

    // Constructor con parámetros
    public Familiar(String cedula, String nombre, String apellido, String direccion,
                    String parentesco, String tipoDeSangre, GregorianCalendar fechaDeNacimiento) {
        super(cedula, nombre, apellido); // Llamada al constructor de la clase padre
        setDireccion(direccion); // Método heredado de la clase Persona
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Métodos getter y setter para acceder y modificar los atributos privados
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

    // Método para calcular la edad a partir de la fecha de nacimiento
    public double calcularEdad() {
        if (fechaDeNacimiento == null) {
            return -1; // Retorna -1 si la fecha de nacimiento no está definida
        }

        Calendar hoy = Calendar.getInstance(); // Obtiene la fecha actual
        int anioActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH);
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);

        int anioNacimiento = fechaDeNacimiento.get(Calendar.YEAR);
        int mesNacimiento = fechaDeNacimiento.get(Calendar.MONTH);
        int diaNacimiento = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);

        int edad = anioActual - anioNacimiento;

        // Ajuste si el cumpleaños aún no ha ocurrido en el año actual
        if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
            edad--;
        }

        return edad;
    }

    // Método toString para representar el objeto como una cadena de texto
    @Override
    public String toString() {
        return super.toString() + // Llamada al método toString de la clase padre
                ",\n Parentesco: " + parentesco +
                ",\n Tipo de Sangre: " + tipoDeSangre +
                ",\n Edad: " + calcularEdad() + " años";
    }
}