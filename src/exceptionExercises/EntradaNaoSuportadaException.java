package exceptionExercises;

import java.io.Serial;

public class EntradaNaoSuportadaException extends RuntimeException{


    @Serial
    private static final long serialVersionUID = 4928599035264976611L;

    public EntradaNaoSuportadaException(String message) {
        super(message);
    }

    public EntradaNaoSuportadaException(Throwable t) {
        super(t);
    }
}
