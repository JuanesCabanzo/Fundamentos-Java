import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }
}