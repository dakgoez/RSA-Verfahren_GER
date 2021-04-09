import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Calculation {

    // Konstruktor
    public Calculation(){}

    //Methode: isPrime
    /* Die Methode isPrime soll zu einer gegebenen Zahl n ermitteln,
    *  ob es sich um eine Primzahl handelt oder nicht. */
    public boolean isPrime(int n){
        if (n == 1 || n == 0) return false;
        for(int i=2; i<n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    // größter gemeinsamer Teiler (ggT)
    /* Die ggT-Methode soll den größten gemeinsamen Teiler zweier Zahlen a und b ermitteln.
    *  Der Algorithmus arbeitet rekursiv. */
    private int ggT(int a, int b){
        if(a==b || b==0) return a;
        else return ggT(b,a%b);
    }

    // Phi-Funktion
    /* Die eulersche Phi-Funktion gibt die Anzahl der teilerfremden Zahlen zur Eingabe n an.
    *  Eine Schleife wird iterativ durchgegangen, welche von i = 1 bis zu n checkt:
    *  ggT(i,n) = 1 => beide Zahlen sind teilerfremd
    *  ggT(i,n) !=1 => beide Zahlen sind NICHT terlerfremd
    *  am Ende wird die Anzahl aller teilerfremden Zahlen zur Eingabe n ausgegeben. */
    private int phi(int n){
        if(n == 1) return 1;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(ggT(i,n)==1) count++;
        }
        return count;
    }

    // generateRandomKey_E-Methode
    /* Die Methode generateRandomKey_E erstellt anhand einer Eingabe n einen zufällig generierten
    *  öffentlichen Schlüssel e.*/
    public int generateRandomKey_E(int n) {
        do {
            int e = (int) (Math.random() * ((phi(n) - 1) - 2)) + 2;
            if (ggT(e, phi(n)) == 1) return e;
        } while (true);
    }

    // generateKey_D-Methode
    /* Die Methode generateKey_D erstellt anhand des öffentlichen Schlüssels e und dem Produkt
    *  der eingegebenen Primzahlen p und q einen privaten Schlüssel d. */
    public int generateKey_D(int e, int n){
        do {
            for (int i = 2; i < phi(n); i++){
                if(i*e%phi(n)==1) return i;
            }
        } while (true);
    }

    //Methode: possiblePublicKeys
    /* Die Methpde possiblePublicKeys gibt die Anzahl aller möglichen öffentlichen Schlüssel e an.
    *  Hierfür wird das Produkt der beiden Eingaben p und q (Element der Primzahlen) verwendet. */
    public int possiblePublicKeys(int n){
        return phi(phi(n));
    }
}
