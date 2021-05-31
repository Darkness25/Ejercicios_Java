package Electrodomesticos;

public class Electrodomestico {

    private double preciobase;
    private String color;
    private char consumoenergetico;
    private int peso;

    public Electrodomestico(){
        color = "Blanco";
        consumoenergetico = 'F';
        preciobase = 100;
        peso = 5;
        comprobarConsumoEnergetico(consumoenergetico);
    }

    public Electrodomestico(int preciobase,int peso){
        this.preciobase = preciobase;
        this.peso = peso;
        color = "Blanco";
        consumoenergetico = 'F';
        comprobarConsumoEnergetico(consumoenergetico);
    }

    public Electrodomestico(double preciobase, int peso, char consumoenergetico, String color) {
        this.preciobase = preciobase;
        this.color = color;
        this.consumoenergetico = consumoenergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(this.consumoenergetico);
    }

    private void comprobarConsumoEnergetico(char letra){

        switch (letra){
            case ('A'):
                preciobase += 100;
                break;
            case ('B'):
                preciobase += 80;
                break;
            case ('C'):
                preciobase += 60;
                break;
            case ('D'):
                preciobase += 50;
                break;
            case ('E'):
                preciobase += 30;
                break;
            case ('F'):
                preciobase += 10;
                break;
            default:
                consumoenergetico = 'F';
                break;
        }
    }

    private void comprobarColor(String color){
        switch (color.toLowerCase()){
            case("blanco"):
                break;
            case("negro"):
                break;
            case("azul"):
                break;
            case("rojo"):
                break;
            case("gris"):
                break;
            default:
                this.color = "blanco";
                break;
        }
    }

    public double precioFinal(){
        if(peso > 0 && peso <= 19){
            preciobase+= 10;
        }
        else if(peso > 19 && peso <= 49){
            preciobase+= 50;
        }
        else if(peso > 49 && peso <= 79){
            preciobase+= 80;
        }
        else if(peso > 79){
            preciobase+= 100;
        }
        else{
            System.out.println("Numero incorrecto");
        }
        return preciobase;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public void aumentarPrecioBase(double aumento){
        preciobase += aumento;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoenergetico() {
        return consumoenergetico;
    }

    public double getPeso() {
        return peso;
    }
}
