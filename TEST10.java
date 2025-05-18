import java.util.Scanner;
//Ejercicio N°10
public class TEST10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la nota de P1: ");
        double p1 = lector.nextDouble();
        System.out.print("Ingrese la nota de P2: ");
        double p2 = lector.nextDouble();
        System.out.print("Ingrese la nota de P3: ");
        double p3 = lector.nextDouble();
        System.out.print("Ingrese la nota del examen final: ");
        double ef = lector.nextDouble();
        System.out.print("Ingrese la nota del trabajo final: ");
        double tf = lector.nextDouble();
        double ff = Math.round((((p1 + p2 + p3)/3) * 0.55) + (ef * 0.30) + (tf * 0.15));
        System.out.print("Su calificacion final es: " +ff);
    }
}
