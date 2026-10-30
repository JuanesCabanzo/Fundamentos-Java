import java.util.Scanner;

public class Ejercicio3 {

    public static int cuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        int resultado = cuadrado(numero);

        System.out.println("El cuadrado es: " + resultado);

        sc.close();
    }
}