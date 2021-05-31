package Replace;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        texto = texto.replace('a','e');
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la frase para concatenar: ");
        String msn = entrada.nextLine();
        System.out.println(texto+" "+msn);

    }

}
