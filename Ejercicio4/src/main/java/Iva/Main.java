package Iva;

import javax.swing.*;

public class Main {

    private static final Double Iva = 0.21;
    public static double CalcularIva(double precio)
    {
        return precio+precio*Iva;
    }


    public static void main(String[] args) {
        Double precio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el precio: "));
        System.out.println("El precio final con Iva es: "+CalcularIva(precio));
    }



}
