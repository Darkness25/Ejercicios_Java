package AreaCirculo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Double radio = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese el radio: "));
        System.out.println("el Area del circulo es: "+Calcular_Area(radio));
    }

    public static double Calcular_Area(Double radio){
        Double area = Math.pow(radio,2)*Math.PI;
        return area;
    }
}
