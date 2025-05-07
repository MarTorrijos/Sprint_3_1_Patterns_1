package level_2.ejercicio_1.application;

import level_2.ejercicio_1.factories.AddressBookSpainFactory;
import level_2.ejercicio_1.factories.AddressBookUKFactory;
import level_2.ejercicio_1.model.Address;
import level_2.ejercicio_1.model.Phone;
import level_2.ejercicio_1.ui.Menu;
import static level_2.ejercicio_1.utils.NumberUtil.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressManager {

    private Scanner scanner = new Scanner(System.in);
    private List<Address> addresses = new ArrayList<>();
    private List<Phone> phoneNumbers = new ArrayList<>();

    private AddressBookSpainFactory spainFactory = new AddressBookSpainFactory();
    private AddressBookUKFactory ukFactory = new AddressBookUKFactory();

    public void run() {
        Menu menu = new Menu();
        menu.runMenu();
    }

// Hay algunas exceptions no gestionadas porque no me daba más la vida x_x

    public void createNewAddress() {
        System.out.println("Creando nueva dirección...");

        String country = chooseCountry();
        String street = getStreet();
        int number = getNumber();
        int zipcode = getZipcode();
        scanner.nextLine();
        String city = getCity();

        createAddress(country, street, number, zipcode, city);
    }

    public String chooseCountry() {
        do {
            try {
                int selection = readInt("""
                De qué país es?
                1 - España
                2 - UK
                """);

                switch (selection) {
                    case 1 -> { return "Spain"; }
                    case 2 -> { return "UK"; }
                    default -> {
                        System.err.println("Error: El número introducido es incorrecto");
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Error: Debes introducir un número");
            }
        } while(true);
    }

    public void createAddress(String country, String street, int number, int zipcode, String city) {
        if (country.equalsIgnoreCase("Spain")) {
            addresses.add(spainFactory.createAddress(street, number, zipcode, city));
        } else if (country.equalsIgnoreCase("UK")) {
            addresses.add(ukFactory.createAddress(street, number, zipcode, city));
        }
    }

    public String getStreet() {
        System.out.println("Di el nombre de la calle");
        return scanner.nextLine().trim();
    }

    public int getNumber() {
        System.out.println("El número");
        return scanner.nextInt();
    }

    public int getZipcode() {
        System.out.println("El código postal");
        return scanner.nextInt();
    }

    public String getCity() {
        System.out.println("Y cual es la ciudad?");
        return scanner.nextLine().trim();
    }

    public void createNewPhoneNumber() {
        System.out.println("Creando nuevo número de teléfono...");

        String country = chooseCountry();

        System.out.println("Cual es el número de teléfono? No hace falta que añadas el prefijo");
        int number = scanner.nextInt();
        scanner.nextLine();

        createPhoneNumber(number, country);
    }

    public void createPhoneNumber(int number, String country) {
        if (country.equalsIgnoreCase("Spain")) {
            phoneNumbers.add(spainFactory.createPhone(number));
        } else if (country.equalsIgnoreCase("UK")) {
            phoneNumbers.add(ukFactory.createPhone(number));
        }
    }

}