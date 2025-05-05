package level_1.ejercicio_1.ui;

import level_1.ejercicio_1.enums.MenuOptions;
import level_1.ejercicio_1.MenuMethods;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    MenuMethods menuMethods = new MenuMethods();

    public void menu() {
        do {
            try {
                viewMenu();
                String input = scanner.nextLine();
                int selection = Integer.parseInt(input);
                MenuOptions selectedOption = MenuOptions.values()[selection - 1];

                switch (selectedOption) {
                    case INPUT_COMMAND -> menuMethods.addCommand();
                    case DELETE_COMMAND -> menuMethods.deleteCommand();
                    case LIST_COMMAND -> menuMethods.listCommand();
                    case EXIT -> {
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Error: Debes introducir un número");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: El input debe ser un número del 1 al 4");
            }
        } while (true);
    }

    public static void viewMenu() {
        System.out.println("____ Selecciona qué quieres hacer ____");

        for (MenuOptions option : MenuOptions.values()) {
            System.out.println(option.ordinal() + 1 + ". " + option.getDescription());
        }
    }

}