package level_2.ejercicio_1.factories;

import level_2.ejercicio_1.model.Address;
import level_2.ejercicio_1.model.Phone;

public interface AddressBookAbstractFactory {

    Address createAddress(String street, int number, int zipcode, String city);
    Phone createPhone(int number);

}