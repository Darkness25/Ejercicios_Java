//7.	Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir
// (do while), después muestra ese número por consola.

package DoWhile;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int numero;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero : "));

        }while(numero < 0);



        System.out.println("El numero ingresado es: "+numero);

    }

}
