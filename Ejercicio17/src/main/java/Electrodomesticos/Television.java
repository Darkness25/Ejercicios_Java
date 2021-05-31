package Electrodomesticos;

public class Television extends Electrodomestico{
    private int pulgadas;
    private boolean sintonizador;

    public Television() {
        pulgadas = 20;
        sintonizador = false;
    }

    public Television(int preciobase, int peso) {
        super(preciobase, peso);
        pulgadas = 20;
        sintonizador = false;
    }

    public Television(double preciobase, int peso, char consumoenergetico, String color, int pulgadas, boolean sintonizador) {
        super(preciobase,peso , consumoenergetico, color);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    @Override
    public double precioFinal() {
        double preciobase = super.precioFinal();
        if( pulgadas > 40){
            preciobase = preciobase*1.30;
        }
        if(sintonizador == true){
            preciobase += 50;
        }

        return preciobase;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

}
