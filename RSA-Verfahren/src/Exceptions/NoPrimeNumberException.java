package Exceptions;

public class NoPrimeNumberException extends Exception {
    @Override
    public String getMessage() {
        return "Die eingegebene Zahl ist keine Primzahl!";
    }
}
