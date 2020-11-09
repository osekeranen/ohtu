package ohtu.verkkokauppa;

public interface PankkiOlio {
    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
