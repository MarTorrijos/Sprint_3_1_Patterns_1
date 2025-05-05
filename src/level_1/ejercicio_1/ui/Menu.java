package level_1.ejercicio_1.ui;

import level_1.ejercicio_1.enums.MenuOptions;
import level_1.ejercicio_1.MenuMethods;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    MenuMethods menuMethods = new MenuMethods();

    public void Menu() {
        try {

            do {
                try {
                    viewMenu();

                    int selection = scanner.nextInt();
                    scanner.nextLine();
                    MenuOptions selectedOption = MenuOptions.values()[selection - 1];

                    switch (selectedOption) {
                        case INPUT_COMMAND -> menuMethods.addCommand();
                        case DELETE_COMMAND -> menuMethods.deleteCommand();
                        case LIST_COMMAND -> menuMethods.listCommand();
                        case EXIT -> {
                            return;
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Error: El número introducido es incorrecto");
                }
            } while (true);

        } finally {
            scanner.close();
        }

    }

    public static void viewMenu() {
        System.out.println("____ Selecciona qué quieres hacer ____");

        for (MenuOptions option : MenuOptions.values()) {
            System.out.println(option.ordinal() + 1 + ". " + option.getDescription());
        }
    }

}