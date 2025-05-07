package level_2.ejercicio_1.model;

public abstract class Address {

    private String street;
    private int number;
    private double zipcode;
    private String city;

    public Address(String street, int number, double zipcode, String city) {
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public double getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public abstract String toString();

}