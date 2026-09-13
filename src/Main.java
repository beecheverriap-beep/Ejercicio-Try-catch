import java.util.Scanner;
import java.util.InputMismatchException;

public  class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = scanner.nextLine();


        try {

        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Acesso autorizado");
        } else {
            System.out.println("Acesso restringido");
        }

        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un numero");
        }
    }
}
