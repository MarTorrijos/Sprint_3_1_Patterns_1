package level_1.ejercicio_1.utils;

import java.util.ArrayList;
import java.util.List;

public final class Undo {

    private static Undo instance;
    private List<String> history;

    private Undo() {
        history = new ArrayList<>();
    }

    public static Undo getInstance() {
        if(instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public List<String> getHistory() {
        return history;
    }

}