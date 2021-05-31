package Contar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese la frase: ");
        String mensaje = entrada.nextLine();
        mensaje = mensaje.toLowerCase();
        System.out.println("El tamaño de la frase es: "+mensaje.length());
        System.out.println("el numero de 'a' son :"+contarVocales(mensaje,'a'));
        System.out.println("el numero de 'e' son :"+contarVocales(mensaje,'e'));
        System.out.println("el numero de 'i' son :"+contarVocales(mensaje,'i'));
        System.out.println("el numero de 'o' son :"+contarVocales(mensaje,'o'));
        System.out.println("el numero de 'u' son :"+contarVocales(mensaje,'u'));

    }

    public static int contarVocales(String mensaje,char vocal){
        int contador = 0;
        int len = mensaje.length();
        for(int i = 0;i<len;i++){
            if(mensaje.charAt(i) == vocal){
                contador++;
            }
        }
        return contador;

    }
}
