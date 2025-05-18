
import java.util.Scanner;
//Ejercicio N°7
public class TEST07 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de minutos: ");
        int m1 = lector.nextInt();
        int h1 = m1 / 60;
        int m2 = m1 % 60;
        System.out.print("La Hora exacta es: " + h1 + ":" + m2);
    }
}
