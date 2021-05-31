package FechaHora;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println("La fecha actual es: "+consultarFecha());
        System.out.println("La hora actual es: "+consultarHora());
    }

    public static String consultarFecha(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return String.valueOf(format.format(LocalDate.now()));
    }

    public static String consultarHora(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        return String.valueOf(format.format(LocalTime.now()));
    }
}
