package Persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el sexo: H o M ");
        char sexo =  entrada.next().charAt(0);
        System.out.println("Ingrese el peso: ");
        double peso = entrada.nextDouble();
        System.out.println("Ingrese la altura: ");
        double altura = entrada.nextDouble();

        Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona p2 = new Persona(nombre,edad,sexo);
        Persona p3 = new Persona();
        p3.setNombre("Arturo Montes");
        p3.setEdad(15);
        p3.setSexo('H');
        p3.setPeso(65);
        p3.setAltura(1.65);
        p1.calcularIMC();
        p2.calcularIMC();
        p3.calcularIMC();
        System.out.println("La persona es mayor de edad? "+p1.esMayorDeEdad());
        System.out.println("La persona es mayor de edad? "+p2.esMayorDeEdad());
        System.out.println("La persona es mayor de edad? "+p3.esMayorDeEdad());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());;




    }
}
