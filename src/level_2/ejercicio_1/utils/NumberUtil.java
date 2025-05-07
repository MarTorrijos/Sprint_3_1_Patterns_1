package level_2.ejercicio_1.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String message){
        int number = 0;
        boolean correctInput = false;

        while (!correctInput) {
            try {
                System.out.println(message);
                number = scanner.nextInt();
                correctInput = true;
            } catch (InputMismatchException e) {
                System.err.println("Error. Introduce un número entero");
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        return number;
    }

}