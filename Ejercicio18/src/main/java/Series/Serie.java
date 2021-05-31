package Series;

public class Serie implements Entregable{
    private String titulo,genero,creador;
    private int temporadas;
    private boolean entregado;

    public Serie(){
        entregado = false;
        temporadas = 3;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        entregado = false;
        temporadas = 3;
    }

    public Serie(String titulo, String creador, String genero, int temporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.temporadas = temporadas;
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
    public boolean Compareto(Object a) {
        Serie p = (Serie) a;
        if(this.temporadas >= p.getTemporadas()){
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", temporadas=" + temporadas +
                ", entregado=" + entregado +
                '}';
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

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

}
