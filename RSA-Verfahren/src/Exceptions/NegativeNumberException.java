package Exceptions;

public class NegativeNumberException extends Exception {
    @Override
    public String getMessage() {
        return "Die eingegebene Zahl darf nicht negativ sein!";
    }
}
