import java.util.Scanner;
import java.util.InputMismatchException;

public  class Main {
    public static void main(String[] args) {

        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("La edad es de: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un numero");
        }
    }
}
