import java.lang.Math;

public class Calculation {

    // Konstruktor
    public Calculation(){}

    //Methode: isPrime
    /* Die Methode isPrime soll zu einer gegebenen Zahl n ermitteln,
    *  ob es sich um eine Primzahl handelt oder nicht. */
    public boolean isPrime(int n){
        if (n == 1) return false;
        for(int i=2;i<n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    // mathematische Funktion: größter gemeinsamer Teiler (ggT)
    /* Die ggT-Methode soll den größten gemeinsamen Teiler zweier Zahlen a und b ermitteln.
    *  Der Algorithmus arbeitet rekursiv. */
    public int ggT(int a, int b){
        if(a==b||b==0) return a;
        else return ggT(b,a%b);
    }

    // mathematische Funktion: Phi-Funktion
    /* Die eulersche Phi-Funktion gibt die Anzahl der teilerfremden Zahlen zur Eingabe n an. */
    public int phi(int n){
        return 0;
    }
}
