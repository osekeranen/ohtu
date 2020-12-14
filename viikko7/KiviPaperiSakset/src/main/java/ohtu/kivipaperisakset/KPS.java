package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPS {
    private static final Scanner scanner = new Scanner(System.in);

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        String ekanSiirto = ensimmainenSiirto();
        String tokanSiirto = toinenSiirto(ekanSiirto);

        while (KPS.onkoOkSiirto(ekanSiirto) && KPS.onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            ekanSiirto = ensimmainenSiirto();

            tokanSiirto = toinenSiirto(ekanSiirto);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    protected String ensimmainenSiirto() {
        System.out.println("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();
        return ekanSiirto;
    }

    abstract protected String toinenSiirto(String siirto);
}
