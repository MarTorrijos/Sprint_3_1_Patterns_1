package level_1.ejercicio_1.enums;

public enum MenuOptions {
    INPUT_COMMAND("Introduce un comando"),
    DELETE_COMMAND("Borrar comando"),
    LIST_COMMAND("Mostrar todos los comandos"),
    EXIT("Salir");

    private String description;

    MenuOptions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}