package Electrodomesticos;

public class Main {

    public static void main(String[] args) {
        double preciototallavadoras=0;
        double preciototaltv=0;
        double preciototalelectro=0;
        Electrodomestico lista_elect[] = new Electrodomestico[10];
        Electrodomestico lav1 = new Lavadora();
        Electrodomestico lav2 = new Lavadora(10,20);
        Electrodomestico lav3 = new Lavadora(20,30,'A',"Blanco",20);
        Electrodomestico tel1 = new Television();
        Electrodomestico tel2 = new Television(30,40,'B',"Negro",65,true);
        Electrodomestico tel3 = new Television(35,30);
        Electrodomestico elect = new Electrodomestico();
        Electrodomestico elect2 = new Electrodomestico(60,10);
        Electrodomestico elect3 = new Electrodomestico(45,40,'E',"violeta");
        Electrodomestico elect4 = new Electrodomestico(75,20,'K',"gris");

        lista_elect[0] = lav1;
        lista_elect[1] = lav2;
        lista_elect[2] = lav3;
        lista_elect[3] = tel1;
        lista_elect[4] = tel2;
        lista_elect[5] = tel3;
        lista_elect[6] = elect;
        lista_elect[7] = elect2;
        lista_elect[8] = elect3;
        lista_elect[9] = elect4;

        for (Electrodomestico elemento: lista_elect) {
            // System.out.println(elemento.precioFinal());
            if(elemento instanceof Lavadora){
                preciototallavadoras+=elemento.precioFinal();
                continue;
            }
            else if(elemento instanceof Television){
                preciototaltv+=elemento.precioFinal();
                continue;
            }
            else if(elemento instanceof Electrodomestico){
                preciototalelectro+=elemento.precioFinal();
            }
        }
        System.out.println("Precio total televisores: $"+preciototaltv);
        System.out.println("Precio total lavadoras: $"+preciototallavadoras);
        System.out.println("Precio total electrodomesticos: $"+preciototalelectro);
        System.out.println("Precio total compra: $"+(preciototalelectro+preciototallavadoras+preciototaltv));
    }
}
