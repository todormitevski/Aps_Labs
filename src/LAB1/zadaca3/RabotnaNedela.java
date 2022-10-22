package LAB1.zadaca3;

import java.util.Arrays;

public class RabotnaNedela {

    private int [] casovi;
    private int brNedela;

    public RabotnaNedela() {}

    public RabotnaNedela(int[] casovi, int brNedela) {
        super();
        this.casovi = casovi;
        this.brNedela = brNedela;
    }

    //getteri
    public int[] getCasovi() {
        return casovi;
    }

    public int getVkupnoCasovi(){
        int suma=0;
        for(int i=0; i < casovi.length; i++){
            suma += casovi[i];
        }

        return suma;
    }

    public int getBrNedela() {
        return brNedela;
    }



    //setteri
    public void setCasovi(int[] casovi) {
        this.casovi = casovi;
    }

    public void setBrNedela(int brNedela) {
        this.brNedela = brNedela;
    }

    @Override
    public String toString() {
        return "RabotnaNedela{" +
                "casovi=" + Arrays.toString(casovi) +
                ", brNedela=" + brNedela +
                '}';
    }
}
