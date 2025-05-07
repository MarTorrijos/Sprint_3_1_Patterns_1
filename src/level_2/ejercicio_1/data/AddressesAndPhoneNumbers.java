package level_2.ejercicio_1.data;

import level_2.ejercicio_1.model.AddressSpain;
import level_2.ejercicio_1.model.AddressUK;
import level_2.ejercicio_1.model.PhoneSpain;
import level_2.ejercicio_1.model.PhoneUK;

import java.util.ArrayList;
import java.util.List;

public class AddressesAndPhoneNumbers {

    private List<Object> objectsToLoad = new ArrayList<>();
    private AddressUK addressUK = new AddressUK("Main street", 10, 19928, "Leeds");
    private AddressSpain addressSpain = new AddressSpain("Calle principal", 10, 8811, "Madrid");
    private PhoneSpain phoneSpain = new PhoneSpain(666555444);
    private PhoneUK phoneUK = new PhoneUK(918414245);

    public void storeObjects() {
        objectsToLoad.add(addressUK);
        objectsToLoad.add(addressSpain);
        objectsToLoad.add(phoneSpain);
        objectsToLoad.add(phoneUK);
    }

    public void loadAddressesAndPhoneNumbers() {
        storeObjects();
        objectsToLoad.forEach(System.out::println);
    }

}
