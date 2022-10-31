//package LAB1.zadaca3;
//
//import java.util.Arrays;
//
//public class Rabotnik {
//
//    private String ime;
//    private RabotnaNedela [] nedeli;
//
//    public Rabotnik(String ime, RabotnaNedela[] nedeli) {
//        super();
//        this.ime = ime;
//        this.nedeli = nedeli;
//    }
//
//    public Rabotnik() {}
//
//    //getteri
//    public String getIme() {
//        return ime;
//    }
//
//    public RabotnaNedela[] getNedeli() {
//        return nedeli;
//    }
//
//    //setteri
//    public void setIme(String ime) {
//        this.ime = ime;
//    }
//
//    public void setNedeli(RabotnaNedela[] nedeli) {
//        this.nedeli = nedeli;
//    }
//
//    public int sumNedela()
//    {
//        int suma=0;
//        for(int i=0;i<4;i++)
//        {
//            suma+=nedeli[i].sumCasovi();
//        }
//        return suma;
//    }
//    @Override
//    public String toString() {
//        String nov = new String();
//        nov = ime+ "   ";
//        for(int i=0;i<4;i++)
//        {
//            nov = nov + nedeli[i].toString() + " ";
//        }
//        nov = nov + sumNedela();
//        return nov;
//    }
//
//}
