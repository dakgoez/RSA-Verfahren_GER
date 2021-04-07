import Exceptions.NegativeNumberException;
import Exceptions.NoPrimeNumberException;

import java.util.InputMismatchException;

public class Main {
    public static void main (String[] args) throws NoPrimeNumberException, NegativeNumberException, InputMismatchException{
    HumanComputerInteraction hci = new HumanComputerInteraction();
    Calculation c = new Calculation();

        int p = hci.assignNumber('p');
        int q = hci.assignNumber('q');
        int n = p*q;
        int e = c.generateRandomKey_E(n);
        int d = c.generateKey_D(e, n);

        System.out.println(" zufällig generierter öffentlicher Schlüssel:" + "\t(" + n + ", " + e + ")");
        System.out.println(" privater Schlüssel:" + "\t(" + n + ", " + d + ")");
    }
}
