
import java.util.Scanner;
//Ejercicio N°3
public class TEST03 {
    public static void main(String[] args) {
        double ca1, ca2, h;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer cateto: ");
        ca1 = lector.nextDouble();
        System.out.print("Ingrese el segundo cateto: ");
        ca2 = lector.nextDouble();
        h = Math.round(Math.sqrt(ca1 * ca1 + ca2 * ca2));
        System.out.print("El Hipotenusa del triangulo es: " + h);
    }
}