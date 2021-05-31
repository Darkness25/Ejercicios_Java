package NumeroMayor;

import java.util.Scanner;

public class NumMayor {
    public NumMayor() {

    }

    public void Numero_Mayor(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 > num1) {
            System.out.println("El numero mayor es: " + num2);
        } else {
            System.out.println("Los numeros son iguales...");
        }
    }

    public void Numero_Mayor_Consola(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese primer numero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Por favor ingrese segundo numero: ");
        int numero2 = entrada.nextInt();
        Numero_Mayor(numero1,numero2);
    }

}
