package level_1.ejercicio_1.application;

import level_1.ejercicio_1.utils.Undo;

import java.util.Scanner;

public class MenuMethods {

    private Undo undo = Undo.getInstance();
    private Scanner scanner = new Scanner(System.in);

    public void addCommand() {
        undo.getHistory().add(getCommand());
    }

    public String getCommand() {
        String input = null;

        while (input == null || input.isEmpty()) {
            try {
                System.out.println("Escribe el comando que quieres añadir");
                input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("El comando no puede estar vacío");
                }
            } catch (IllegalStateException e) {
                System.out.println("El escaner está cerrado D:");
            }
        }

        return input;
    }

    public void deleteCommand() {
        if(!undo.getHistory().isEmpty()){
            undo.getHistory().removeLast();
            System.out.println("Último comando eliminado");
        }else{
            System.out.println("No hay comandos para eliminar");
        }
    }

    public void listCommand() {
        undo.getHistory().forEach(System.out::println);
    }

}