package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas:");
        int nPersonas = scanner.nextInt();
        scanner.nextLine();
        Persona[] personas = new Persona[nPersonas];

        for (int i = 0; i < nPersonas; i++) {
            System.out.println("\nPersona " + (i + 1));
            System.out.print("Ingrese la cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Ingrese el sexo: ");
            String sexo = scanner.nextLine();

            personas[i] = new Persona(cedula, nombre, apellido);
            personas[i].setDireccion(direccion);
            personas[i].setSexo(sexo);
        }

        System.out.println("\nIngrese la cantidad de familiares:");
        int nFamiliares = scanner.nextInt();
        scanner.nextLine();
        Familiar[] familiares = new Familiar[nFamiliares];

        for (int i = 0; i < nFamiliares; i++) {
            System.out.println("\nFamiliar " + (i + 1));
            System.out.print("Ingrese la cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese la dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Ingrese el parentesco: ");
            String parentesco = scanner.nextLine();
            System.out.print("Ingrese el tipo de sangre: ");
            String tipoDeSangre = scanner.nextLine();
            System.out.print("Ingrese el año de nacimiento: ");
            int anio = scanner.nextInt();
            System.out.print("Ingrese el mes de nacimiento (1-12): ");
            int mes = scanner.nextInt() - 1;
            System.out.print("Ingrese el día de nacimiento: ");
            int dia = scanner.nextInt();
            scanner.nextLine();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);

            familiares[i] = new Familiar(cedula, nombre, apellido, direccion, parentesco, tipoDeSangre, fechaNacimiento);
        }

        System.out.println("\nDatos de las personas ingresadas:");
        for (Persona p : personas) {
            System.out.println(p);
        }

        System.out.println("\nDatos de los familiares ingresados:");
        for (Familiar f : familiares) {
            System.out.println(f);
        }

        scanner.close();
    }
}
