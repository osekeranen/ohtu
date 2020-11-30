package laskin;

import java.util.*;

public class Sovelluslogiikka {

    LinkedList<Integer> historia = new LinkedList<>();
 
    private int tulos;
 
    public void plus(int luku) {
        tulos += luku;
    }
     
    public void miinus(int luku) {
        tulos -= luku;
    }
 
    public void nollaa() {
        tulos = 0;
    }
 
    public int tulos() {
        historia.add(tulos);
        return tulos;
    }

    public int peru() {
        try {
            historia.removeLast();
            tulos = historia.removeLast();
        } catch (Exception e) {
            tulos = 0;
        }
        return tulos;
    }
}