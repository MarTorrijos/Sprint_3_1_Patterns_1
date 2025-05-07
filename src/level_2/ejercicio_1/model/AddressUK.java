package level_2.ejercicio_1.model;

public class AddressUK extends Address {

    private static final String COUNTRY = "UK";

    public AddressUK(String street, int number, double zipcode, String city) {
        super(street, number, zipcode, city);
    }

    @Override
    public String toString() {
        return "Address:" + System.lineSeparator() + getStreet() + ", number " + getNumber() + ", zipcode "
                + getZipcode() + ", city " + getCity() + ", " + COUNTRY;
    }

}