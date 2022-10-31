//package LAB1.zadaca3;
//import java.awt.*;
//import java.lang.module.FindException;
//import java.util.Scanner;
//
//public class Main {
//
//     // Метод int sumNedeli(Rabotnik r) кој ќе врати сума од сите работни часови во сите недели за дадениот работник
//    public static int sumNedeli(Rabotnik r){  //mora da e public static
//        int suma=0;
//        for(int i=0; i< r.getNedeli().length; i++){
//            for(int j=0; j< r.getNedeli()[i].getVkupnoCasovi(); j++){
//                suma+= r.getNedeli()[i].getVkupnoCasovi();
//            }
//        }
//        return suma;
//    }
//
//
//
//    //Метод Rabotnik najvreden_rabotnik(Rabotnik [] niza) кој за дадената низа од работници
//    // ќе го врати работникот со најмногу работни часови (од сите недели)
//    public static Rabotnik najvreden_rabotnik(Rabotnik [] niza)
//    {
//        int maxRabotniCasovi = sumNedeli(niza[0]);
//        int Index = 0;
//        for(int i=0; i< niza.length; i++){
//            if(sumNedeli(niza[i]) > maxRabotniCasovi){
//                maxRabotniCasovi = sumNedeli(niza[i]);
//                Index = i;
//            }
//        }
//
//        return niza[Index];
//    }
//
//    //На стандарден излез да се испечати низата од работници со помош на методата void table(Rabotnik [] niza) која за низата
//    // од работници ќе отпечати приказ во следниот формат (за простор при печатење се користат три празни места):
//    public static void table(Rabotnik [] niza)
//    {
//        System.out.println("Rab   1   2   3   4   Vkupno");
//        for(int i=0;i<niza.length;i++)
//        {
//            System.out.println(niza[i]);
//        }
//
//    }
//
//    // Да се дополни main методот во кој ќе се иницијализира низа од работници и работни недели согласно влезните тест примери.
//    // Во првиот ред се чита број на работници, а во секој нареден ред се читаат името и работните недели за секој работник.
//    public static void main(String[] args) {
//        int n;
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
//        Rabotnik [] niza = new Rabotnik[n];
//        for(int i=0;i<n;i++)
//        {
//            //vasiot kod tuka
//
//            RabotnaNedela nedela[] = new RabotnaNedela[4];
//            String ime = input.next();
//
//            //niza[i].setIme(input.nextLine());
//            for(int j=0; j<4; j++){
//                int casovi[] = new int[5];
//                for(int k=0;k<5;k++)
//                {
//                    casovi[k] = input.nextInt();
//                }
//                nedela[j] = new RabotnaNedela(casovi,j+1);
//            }
//            niza[i] = new Rabotnik(ime,nedela);
//        }
//
//        table(niza);
//        System.out.println();
//        System.out.println("NAJVREDEN RABOTNIK: " +najvreden_rabotnik(niza).getIme());
//
//    }
//}