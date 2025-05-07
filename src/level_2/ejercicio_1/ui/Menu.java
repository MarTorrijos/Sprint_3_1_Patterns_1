package level_2.ejercicio_1.ui;

import level_2.ejercicio_1.enums.MenuOptions;
import level_2.ejercicio_1.application.AddressManager;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private AddressManager addressManager = new AddressManager();

    public void runMenu() {
        MenuOptions selectedOption = null; 
        
        do {
            try {
                viewMenu();
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    System.err.print("Error: No puedes responder en blanco, debes introducir un número");
                }

                int selection = Integer.parseInt(input);
                selectedOption = MenuOptions.values()[selection - 1];

                switch (selectedOption) {
                    case CREATE_ADDRESS -> addressManager.createNewAddress();
                    case CREATE_PHONENUMBERS -> addressManager.createNewPhoneNumber();
                    case EXIT -> System.out.println("deuuu");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error: Debes introducir un número");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: El input debe ser un número del 1 al 4");
            }
        } while (selectedOption != MenuOptions.EXIT);
    }

    public void viewMenu() {
        System.out.println("Selecciona qué quieres hacer:");

        for(MenuOptions option : MenuOptions.values()) {
            System.out.println(option.ordinal() + 1 + ". " + option.getDescription());
        }
    }

}