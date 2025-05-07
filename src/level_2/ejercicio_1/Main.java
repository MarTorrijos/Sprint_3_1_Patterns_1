package level_2.ejercicio_1;

import level_2.ejercicio_1.application.AddressManager;
import level_2.ejercicio_1.data.AddressesAndPhoneNumbers;

public class Main {

    public static void main(String[] args) {

        AddressManager manager = new AddressManager();
        AddressesAndPhoneNumbers sampleObjects = new AddressesAndPhoneNumbers();

        sampleObjects.loadAddressesAndPhoneNumbers();
        manager.run();

    }

}