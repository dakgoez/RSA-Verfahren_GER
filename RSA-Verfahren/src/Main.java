import Exceptions.NegativeNumberException;
import Exceptions.NoPrimeNumberException;

import java.util.InputMismatchException;

public class Main {
    public static void main (String[] args) throws NoPrimeNumberException, NegativeNumberException, InputMismatchException{
    HumanComputerInteraction hci = new HumanComputerInteraction();
        int p = hci.assignNumber('p');
        int q = hci.assignNumber('q');
        System.out.println(p);
        System.out.println(q);

    }
}
