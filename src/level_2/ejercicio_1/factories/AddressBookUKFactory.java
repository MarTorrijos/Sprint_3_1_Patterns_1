package level_2.ejercicio_1.factories;

import level_2.ejercicio_1.model.*;

public class AddressBookUKFactory implements AddressBookAbstractFactory {

    @Override
    public Address createAddress(String street, int number, int zipcode, String city) {
        return new AddressUK(street, number, zipcode, city);
    }

    @Override
    public Phone createPhone(int number) {
        return new PhoneUK(number);
    }

}