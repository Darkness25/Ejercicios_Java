package IgualDiferente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la palabra 1: ");
        String palabra1 = entrada.nextLine();
        System.out.println("Por favor ingrese la palabra 2: ");
        String palabra2 = entrada.nextLine();
        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("Las Palabras: SON IGUALES...");
        }
        else{
            System.out.println("Las Palabras: No son iguales: ");
            mostrarDiferencia(palabra1,palabra2);
        }
    }

    public static void mostrarDiferencia(String palabra1,String palabra2){
        String espacios = " ";
        espacios = espacios.repeat(Math.abs(palabra1.length()-palabra2.length()));
        if(palabra1.length() < palabra2.length()){
            palabra1 = palabra1+espacios;
        }
        else{
            palabra2 = palabra2+espacios;
        }

        for (int i = 0; i<palabra1.length();i++){
            if(palabra1.charAt(i) != palabra2.charAt(i)){
                if (palabra1.charAt(i) == ' ' ){
                    System.out.println("letra diferente es: espacio con "+palabra2.charAt(i));
                }
                else if(palabra2.charAt(i) == ' '){
                    System.out.println("letra diferente es: espacio con "+palabra1.charAt(i));
                }
                else{
                    System.out.println("letra diferente es: "+palabra1.charAt(i)+" con "+palabra2.charAt(i));

                }
            }
        }
    }

}
