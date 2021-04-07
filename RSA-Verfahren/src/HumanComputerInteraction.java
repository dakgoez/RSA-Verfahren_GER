import java.util.Scanner;

public class HumanComputerInteraction {

    // Konstruktor
    public HumanComputerInteraction(){}

    Scanner scan = new Scanner(System.in);

    public int enterNumber(){
        int n = scan.nextInt();
        return n;
    }
}
