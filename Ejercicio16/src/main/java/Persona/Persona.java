package Persona;

public class Persona {


    private String nombre ;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){
        nombre = "";
        edad = 0;
        sexo = 'H';
        peso = 0.0;
        altura = 0.0;
        generaDNI();
    }

    public Persona(String nombre,int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0.0;
        altura = 0.0;
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    public int calcularIMC(){
        double imc = peso/(Math.pow(altura,2));
        if(imc < 20){
            System.out.println("Esta bajo de peso...");
            return -1;
        }
        else if(imc >= 20 && imc <= 25) {
            System.out.println("Peso normal ...");
            return 0;
        }
        else{
            System.out.println("Esta en sobrepeso...");
            return 1;
        }
    }

    public boolean esMayorDeEdad(){
        boolean resultado = (edad >= 18)?true:false;
        return resultado;
    }

    private void comprobarSexo(){
        if(sexo != 'H' || sexo != 'M'){
            this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    private void generaDNI(){
        int numeroaleatorio = generarAleatorio();
        dni = String.valueOf(numeroaleatorio)+generarLetraDni(numeroaleatorio);
        System.out.println("dni: "+dni);
    }

    public int generarAleatorio(){
        int aleatorio = (int)(Math.random()*100000000);
        return aleatorio;
    }

    public char generarLetraDni(int dni){
        char lista[] = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'Q', 'E'};
        int resto = dni%23;
        return lista[resto];
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
