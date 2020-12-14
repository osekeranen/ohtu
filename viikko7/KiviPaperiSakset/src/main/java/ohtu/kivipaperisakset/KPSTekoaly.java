package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPS {

    Pelaaja pelaaja;

    public KPSTekoaly() {
        this.pelaaja = new Tekoaly();
    }

    @Override
    protected String toinenSiirto(String siirto) {
        String tokaSiirto = pelaaja.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokaSiirto);
        pelaaja.asetaSiirto(siirto);
        return tokaSiirto;
    }
}