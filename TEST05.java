
import java.util.Scanner;
//Ejercicio N°5
public class TEST05 {
    public static void main(String[] args) {
        double c, f;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el valor en C°: ");
        c = lector.nextDouble();
        f = c * 9/5 +32;
        System.out.print("El valor convertido es: " + f + "°F");
    }
}