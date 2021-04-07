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
        if (n == 1) return false;
        for(int i=2; i<n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    // größter gemeinsamer Teiler (ggT)
    /* Die ggT-Methode soll den größten gemeinsamen Teiler zweier Zahlen a und b ermitteln.
    *  Der Algorithmus arbeitet rekursiv. */
    public int ggT(int a, int b){
        if(a==b || b==0) return a;
        else return ggT(b,a%b);
    }

    // Primfaktorzerlegung
    /* Die primFaktor-Methode repräsentiert die Primfaktorzerlegung.
    *  Alle Primfaktoren einer eingebenen Zahl n werden in einer Liste gespeichert. */
    public List<Integer> primFaktor(int n){
        List<Integer> factors = new ArrayList<>();
        if(isPrime(n)) {factors.add(n); return factors;}
        for (int i = 1; i <= n/2; i++){
            if(isPrime(i) && (n%i == 0)) {factors.add(i);}
        }
        return factors;
    }

    public boolean has(List<Integer> l, int a){
        for (int i : l) {
            if(i == a) return true;
        }
        return false;
    }

    // Phi-Funktion
    /* Die eulersche Phi-Funktion gibt die Anzahl der teilerfremden Zahlen zur Eingabe n an. */
    public int phi(int n){
        if(n == 1) return 1;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(ggT(i,n)==1) count++;
        }
        return count;
    }
}
