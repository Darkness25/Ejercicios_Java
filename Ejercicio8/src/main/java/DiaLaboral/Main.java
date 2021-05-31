package DiaLaboral;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       String Dia = JOptionPane.showInputDialog("Por favor escoja un dia de la semana \n" +


                "L - Lunes\n" +
                "M - Martes\n" +
                "W - Miercoles\n" +
                "J - Jueves\n" +
                "V - Viernes\n" +
                "S - Sabado\n" +
                "D - Domingo");
        switch (Dia){
            case "L":
                System.out.println("El lunes es un dia laboral...");
                break;
            case "M":
                System.out.println("El martes es un dia laboral..");
                break;
            case "W":
                System.out.println("El miercoles es un dia laboral...");
                break;
            case "J":
                System.out.println("El jueves es un dia laboral...");
                break;
            case "V":
                System.out.println("El viernes es un dia laboral...");
                break;
            case "S || s":
                System.out.println("El sabado no es un dia laboral...");
                break;
            case "D":
                System.out.println("El domingo no es un dia laboral...");
                break;
            default:
                System.out.println("Opcion Incorrecta- Intente de nuevo...");

        }


    }
}
