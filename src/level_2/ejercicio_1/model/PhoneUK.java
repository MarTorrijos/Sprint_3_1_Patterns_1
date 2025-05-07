package level_2.ejercicio_1.model;

public class PhoneUK extends Phone {

    private static final int PREFIX = 44;

    public PhoneUK(int number){
        super(number);
    }

    @Override
    public String toString() {
        return "+" + PREFIX + getNumber();
    }

}