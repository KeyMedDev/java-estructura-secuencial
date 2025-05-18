import java.util.Scanner;
//Ejercicio N°1
public class TEST01 {
    public static void main(String[] args) {
        String n;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        n = lector.nextLine();
        System.out.print("Bienvenido " + n + "!");
        lector.close();
        }
    }
