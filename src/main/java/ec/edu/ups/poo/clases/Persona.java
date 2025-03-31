package ec.edu.ups.poo.clases;

import java.util.Scanner;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String sexo;

    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() { }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void ingresarSexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sexo de la persona: ");
        this.sexo = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "\n Cedula: " + cedula +
                ",\n Nombre: " + nombre +
                ",\n Apellido: " + apellido +
                ",\n Direccion: " + direccion +
                ",\n Sexo: " + sexo;
    }
}
