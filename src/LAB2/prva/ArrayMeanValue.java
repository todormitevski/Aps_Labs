package LAB2.prva;

import java.util.Scanner;
import static java.lang.Math.abs;

public class ArrayMeanValue {

    //todo: implement function
//    public static int brojDoProsek(Array<Integer> arr) {
//        for(int i=0; i<arr.getSize(); i++){
//            double niza = arr.get(i);
//            //best case scenario
//            if(niza == Prosek(arr)){
//                return arr.get(i);
//            }
//            //ako ne e isto da go zeme brojot so najmala razlika
//            double razlika = abs(Prosek(arr) - arr.get(i));
//            double min=0;
//            if(min<razlika){
//                razlika = min;
//            }
//        }
//
//        int[] temp = new int [arr.getSize()];
//        int n = arr.getSize();
//
//
//    }

    //todo: implement function
    public static int brojDoProsek(Array<Integer> arr) {
        int suma = 0;
        double prosek =0;
        for(int i=0; i<arr.getSize(); i++){
            suma += arr.get(i);
        }

        prosek = suma/ arr.getSize();

        //da najdeme koj br e do prosek

        int min = 9999;
        int rez=0;
        int rez1=0;
        for(int i=0; i<arr.getSize(); i++){

            //razlika ni zima abs od  n=4  2 3 7 5
            //suma= 17   prosek = 17/4 = 3.25
            //za2: razlika = (4 - 2)  = 2  POGOLEM E
            // min = 6,   rez= 2

            int razlika = Math.abs((int)prosek - arr.get(i));
            if(min > razlika){
                min = razlika;
                rez = arr.get(i);

            }

            if(min >= razlika){
                min = razlika;
                rez1 = arr.get(i);
            }

        }

        //ako brojot e pomegju eden pogolem i eden pomal
        //da se zeme pomaliot
        if(rez > rez1){
            return rez1;
        }else{
            return rez;
        }

    }



    //pravime funkcija da najdeme prosek
//    public static double Prosek(Array<Integer> arr){
//        double prosek = 0;
//        for(int i=0; i<arr.getSize(); i++){
//            prosek+= arr.get(i);
//
//        }
//        return prosek;
//    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        Array<Integer> arr = new Array<>(N);

        for(int i=0;i<N;i++) {
            arr.insertLast(input.nextInt());
        }

        System.out.println(brojDoProsek(arr));
    }
}
