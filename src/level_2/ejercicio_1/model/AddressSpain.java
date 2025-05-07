package level_2.ejercicio_1.model;

public class AddressSpain extends Address {

    private static final String COUNTRY = "Spain";

    public AddressSpain(String street, int number, double zipcode, String city) {
        super(street, number, zipcode, city);
    }

    @Override
    public String toString() {
        return "Dirección:" + System.lineSeparator() + getStreet() + ", número " + getNumber() + ", código postal "
                + getZipcode() + ", ciudad " + getCity() + ", " + COUNTRY;
    }
}
