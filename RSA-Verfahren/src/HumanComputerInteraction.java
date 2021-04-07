import java.util.Scanner;

public class HumanComputerInteraction {

    // Konstruktor
    public HumanComputerInteraction(){}

    Scanner scan = new Scanner(System.in);

    public int enterPrimeNumber(char y){
        System.out.print("Bitte geben Sie eine Primzahl für " + y + " ein: ");
        int n = scan.nextInt();
        return n;
    }
}
