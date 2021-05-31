package Num2en2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Por favor ingrese un numero: ");
        int num = entrada.nextInt();
        for (int i =num; i<=1000;i+=2){
            System.out.println(i);
        }

    }
}
