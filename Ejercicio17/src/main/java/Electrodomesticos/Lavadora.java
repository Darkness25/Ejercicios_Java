package Electrodomesticos;

public class Lavadora extends Electrodomestico {

    private double carga;


    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(int preciobase, int peso) {
        super(preciobase, peso);
        carga = 5;
    }

    public Lavadora(double preciobase,  int peso, char consumoenergetico,String color, double carga) {
        super(preciobase, peso, consumoenergetico,color );
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double preciobase = super.precioFinal();
        if( carga > 30){
            preciobase += 50;
        }

        return preciobase;

    }

    public double getCarga() {
        return carga;
    }


}
