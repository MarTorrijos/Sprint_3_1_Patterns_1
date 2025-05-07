package level_2.ejercicio_1.factories;

import level_2.ejercicio_1.model.Address;
import level_2.ejercicio_1.model.AddressSpain;
import level_2.ejercicio_1.model.Phone;
import level_2.ejercicio_1.model.PhoneSpain;

public class AddressBookSpainFactory implements AddressBookAbstractFactory {

    @Override
    public Address createAddress(String street, int number, int zipcode, String city) {
        return new AddressSpain(street, number, zipcode, city);
    }

    @Override
    public Phone createPhone(int number) {
        return new PhoneSpain(number);
    }

}