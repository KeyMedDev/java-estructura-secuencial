import java.util.Scanner;
//Ejercicio N°9
public class TEST09 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el monto de su compra: ");
        double s1 = lector.nextDouble();
        double t1 = s1 - (s1 * 0.150);
        System.out.println("El total con descuento es: " + t1);
    }
}