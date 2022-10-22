package LAB1.zadaca1;

import java.io.*;
import java.util.Scanner;

public class PushZero {
    static void pushZerosToEnd(int arr[], int n)
    {
        int temp[] = new int[100];
        int brojac = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[brojac] = arr[i];
                brojac++;
            }
        }

        while(brojac<n){
            arr[brojac] =0;
            brojac++;
        }

        System.out.println("Transformiranata niza e: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[] args)
    {
        //deklariranje na niza
        int arr[] = new int[100];
        int n;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }


        pushZerosToEnd(arr, n);

    }
}
