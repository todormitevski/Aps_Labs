package LAB1.zadaca3;

import java.util.Arrays;

public class Rabotnik {

    private String ime;
    private RabotnaNedela [] nedeli;

    public Rabotnik(String ime, RabotnaNedela[] nedeli) {
        super();
        this.ime = ime;
        this.nedeli = nedeli;
    }

    public Rabotnik() {}

    //getteri
    public String getIme() {
        return ime;
    }

    public RabotnaNedela[] getNedeli() {
        return nedeli;
    }

    //setteri
    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setNedeli(RabotnaNedela[] nedeli) {
        this.nedeli = nedeli;
    }


    @Override
    public String toString() {
        return "Rabotnik{" +
                "ime='" + ime + '\'' +
                ", nedeli=" + Arrays.toString(nedeli) +
                '}';
    }
}
