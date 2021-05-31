package Series;

public class Main {
    public static void main(String[] args) {
        Serie lista_series[] = new Serie[5];
        Videojuego lista_video[] = new Videojuego[5];



        Serie s1 = new Serie();
        Serie s2 = new Serie("Sexify", "mateo");
        Serie s3 = new Serie("Ragnarok", "Ragk", "Accion", 6);
        Serie s4 = new Serie("Once upon a time", "vivi", "drama", 9);
        Serie s5 = new Serie("game of thrones", "tyy");

        Videojuego v1 = new Videojuego();
        Videojuego v2 = new Videojuego("PrinceOfPersia", 5);
        Videojuego v3 = new Videojuego("MortalKombat", 50);
        Videojuego v4 = new Videojuego("Driver", 3);
        Videojuego v5 = new Videojuego("fifa19", 5);

        lista_series[0] = s1;
        lista_series[1] = s2;
        lista_series[2] = s3;
        lista_series[3] = s4;
        lista_series[4] = s5;

        lista_video[0] = v1;
        lista_video[1] = v2;
        lista_video[2] = v3;
        lista_video[3] = v4;
        lista_video[4] = v5;


        v1.entregar();
        s1.entregar();
        v3.entregar();
        s4.entregar();
        v5.entregar();

        contarJuegos(lista_video);
        contarSeries(lista_series);

        elegirHorasMayor(lista_video);
        elegirTemporadasMayor(lista_series);

    }

    public static void contarJuegos(Videojuego lista[]){
        int totaljuegosentregados = 0;
        for (int i = 0; i < 5; i++) {
            if (lista[i].isEntregado() == true) {
                totaljuegosentregados += 1;
                lista[i].devolver();
            }
        }
        System.out.println("el total de video juegos entregados es: " + totaljuegosentregados);
    }

    public static void contarSeries(Serie lista[]){
        int totalseriesentregadas = 0;
        for (int i = 0; i < 5; i++) {
            if (lista[i].isEntregado() == true) {
                totalseriesentregadas += 1;
                lista[i].devolver();
            }
        }
        System.out.println("el total de series entregadas es: " + totalseriesentregadas);
    }

    public static void elegirHorasMayor(Videojuego lista[]) {
        Videojuego timepomayor = lista[0];
        for (int i = 1; i < 5; i++) {
            if (lista[i].Compareto(timepomayor)) {
                timepomayor = lista[i];
            }
        }
        System.out.println(timepomayor.toString());
    }

    public static void elegirTemporadasMayor(Serie lista[]) {
        Serie temporadamayor = lista[0];
        for (int i = 1; i < 5; i++) {
            if (lista[i].Compareto(temporadamayor)) {
                temporadamayor = lista[i];
            }
        }
        System.out.println(temporadamayor.toString());
    }
    }
