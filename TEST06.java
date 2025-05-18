
import java.util.Scanner;
//Ejercicio N°6
public class TEST06 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double n1 = lector.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double n2 = lector.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double n3 = lector.nextDouble();
        double r = Math.round((n1 + n2 + n3)/3);
        System.out.print("La media es: " + r);
    }
}
