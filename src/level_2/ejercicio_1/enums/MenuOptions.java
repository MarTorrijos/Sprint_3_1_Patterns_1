package level_2.ejercicio_1.enums;

public enum MenuOptions {

    CREATE_ADDRESS("Introducir una dirección"),
    CREATE_PHONENUMBERS("Introducir un número de teléfono"),
    EXIT("Salir");

    private String description;

    MenuOptions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}