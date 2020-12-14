package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        KPS peli;

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            if (vastaus.endsWith("a")) {
                peli = luoMoninpeli();
            } else if (vastaus.endsWith("b")) {
                peli = luoYksinpeli();
            } else if (vastaus.endsWith("c")) {
                peli = luoVaikeaYksinpeli();
            } else {
                break;
            }
            peli.pelaa();
        }

    }

    private static KPS luoMoninpeli() {
        return  new KPSPelaajaVsPelaaja();
    }

    private static KPS luoYksinpeli() {
        return new KPSTekoaly();
    }

    private static KPS luoVaikeaYksinpeli() {
        return new KPSParempiTekoaly();
    }
}
