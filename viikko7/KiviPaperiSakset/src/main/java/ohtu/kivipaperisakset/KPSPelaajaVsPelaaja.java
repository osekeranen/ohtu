package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPS {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    protected String toinenSiirto(String siirto) {
        System.out.println("Toisen pelaajan siirto: ");
        String tokaSiirto = scanner.nextLine();
        return tokaSiirto;
    }
}