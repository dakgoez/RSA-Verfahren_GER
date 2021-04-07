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
    public int generateRandomKey_E(int n){
        int min = 1;
        int max = phi(n);
        int e = 0;
        while(true){
            e = (int) (Math.random() * (max - min)) + min;
            if(ggT(e, phi(n))==1) break;
        }
        return e;
    }

    // generateKey_D-Methode
    /* Die Methode generateKey_D erstellt anhand des öffentlichen Schlüssels e und dem Produkt
    *  der eingegebenen Primzahlen p und q einen privaten Schlüssel d. */
    public int generateKey_D(int e, int n){
        int min = 1;
        int max = phi(n);
        int d = 0;
        while(true){
            d = (int) (Math.random() * (max - min)) + min;
            if(d*e%phi(n)==1) break;
        }
        return d;
    }
}
