package ParImpar;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while(i<=100){
            if ( i %2 == 0){
                System.out.println("el numero "+i+" es par..");
            }
            else{
                System.out.println("el numero "+i+" es impar..");
            }
            i++;
        }

    }
}
