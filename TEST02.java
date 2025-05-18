import java.util.Scanner;
//Ejercicio N°2
public class TEST02 {
    public static void main(String[] args) {
        int h, b, r;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la altura: ");
        h = lector.nextInt();
        System.out.print("Ingrese la base: ");
        b = lector.nextInt();
        r = h * b;
        System.out.print("El área del rectángulo es: " + r);
    }
}
