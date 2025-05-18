import java.util.Scanner;
//Ejercicio N°8
public class TEST08 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de su sueldo base: ");
        double s1 = lector.nextDouble();
        System.out.print("Ingrese la cantidad total de ventas: ");
        double v1 = lector.nextDouble();
        double t1 = v1 * 0.10;
        double t2 = s1 + t1;
        System.out.println("Su total de comisiones es de: " + t1);
        System.out.print("Su suelto total es de: " + t2);
    }
}
