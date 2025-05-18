import java.util.Scanner;
//Ejercicio N°4
public class TEST04 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double n1 = lector.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = lector.nextDouble();
        double s = n1 + n2;
        double r = n1 - n2;
        double m = n1 * n2;
        double d = n1 / n2;
        System.out.println("La suma es: " + s);
        System.out.println("La resta es: " + r);
        System.out.println("La multiplicacion es: " + m);
        System.out.println("La division es: " + d);
    }
}