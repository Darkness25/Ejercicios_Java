package ReplaceSpace;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String mensaje = entrada.nextLine();
        mensaje = mensaje.replace(" ","");
        System.out.println(mensaje);


    }
}
