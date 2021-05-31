package Series;

public class Videojuego implements Entregable{

    private String titulo,genero,compania;
    private double horasestimadas;
    private boolean entregado;

    public Videojuego(){
        horasestimadas = 10;
        entregado = false;
    }

    public Videojuego(String titulo, double horasestimadas) {
        this.titulo = titulo;
        this.horasestimadas = horasestimadas;
        horasestimadas = 10;
        entregado = false;
    }

    public Videojuego(String titulo, double horasestimadas, String compania, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasestimadas = horasestimadas;
        entregado = false;
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
                ", horasestimadas=" + horasestimadas +
                ", entregado=" + entregado +
                '}';
    }

    @Override
    public boolean Compareto(Object a) {
        Videojuego p = (Videojuego)a;
        if(this.horasestimadas >= p.getHorasestimadas()){
            return true;
        }
        else {
            return false;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public double getHorasestimadas() {
        return horasestimadas;
    }

    public void setHorasestimadas(double horasestimadas) {
        this.horasestimadas = horasestimadas;
    }

}
