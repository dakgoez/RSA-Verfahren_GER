import Exceptions.NegativeNumberException;
import Exceptions.NoPrimeNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanComputerInteraction {

    // Konstruktor
    public HumanComputerInteraction(){}

    Calculation c = new Calculation();
    Scanner scan = new Scanner(System.in);

    /* Die Methode enterPrimeNumber fordert den User dazu auf, eine Primzahl einzugeben.
    *  Bei einer falschen Eingabe wird eine entsprechende Exception ausgegeben. */
    public int enterPrimeNumber(char y) throws NoPrimeNumberException, NegativeNumberException {
        int x = 0;
        System.out.println("Bitte geben Sie eine Primzahl für " + y + " ein: ");
        try{
            int n = scan.nextInt();
            x = n;
        } catch (InputMismatchException e){
            scan.next();
            throw new InputMismatchException();
        }
        if (!c.isPrime(x)) throw new NoPrimeNumberException();
        if (x < 0 ) throw new NegativeNumberException();
        return x;
    }

    /* Die Methode assignNumber greift auf die Methode enterPrimeNumber zu und fordert den User so lange auf eine
    *  Zahl einzugeben, bis der User dies tut. */
    public int assignNumber(char a){
        boolean abbruch = false;
        int n = 0;
        while(!abbruch){
            try {
                int m = enterPrimeNumber(a);
                n = m;
                abbruch = true;
            } catch (NoPrimeNumberException e) {
                e.printStackTrace();
            } catch (NegativeNumberException e){
                e.printStackTrace();
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
        return n;
    }

}
