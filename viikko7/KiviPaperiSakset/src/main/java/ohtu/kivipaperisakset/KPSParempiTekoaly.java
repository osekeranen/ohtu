package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {

    Pelaaja pelaaja;

    public KPSParempiTekoaly() {
        this.pelaaja = new TekoalyParannettu(20);
    }

    @Override
    protected String toinenSiirto(String siirto) {
        String tokaSiirto = pelaaja.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokaSiirto);
        pelaaja.asetaSiirto(siirto);
        return tokaSiirto;
    }

}
