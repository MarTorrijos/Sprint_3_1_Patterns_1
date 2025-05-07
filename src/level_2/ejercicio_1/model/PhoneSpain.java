package level_2.ejercicio_1.model;

public class PhoneSpain extends Phone {

    private static final int PREFIX = 34;

    public PhoneSpain(int number){
        super(number);
    }

    @Override
    public String toString() {
        return "+" + PREFIX + getNumber();
    }

}