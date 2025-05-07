package level_2.ejercicio_1.model;

public abstract class Phone {

    private int number;

    public Phone(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public abstract String toString();

}