package LAB1.zadaca2;
import java.sql.SQLOutput;
import java.util.Scanner;  //za da chitame od tastatura


//da najdeme initials na nekoe ime
//primer Steve Jobs --> SJ

public class Initials {

    static void printInitials(String name)
    {
        if(name.length() == 0){
            return;
        }

        //pravime nov string prazen da bide
        String inicijali = "";

        //go dodavame noviot string
        //mora so plus ednakvo da se dodade, so = ke go izbrise
        inicijali += name.charAt(0);

        //vrtime niz cela niza
        for(int i=1; i<name.length(); i++){

            //ako naide na prazno mesto, slednata bukva od praznoto mesto i+1 ke ja naprai vo upper i ke printa
            if(name.charAt(i) == ' '){
                inicijali+= name.charAt(i+1);
            }
        }

        inicijali =  inicijali.toUpperCase();
        System.out.println( inicijali);
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        String name;
        input.nextLine();

        for(int i=0; i<n; i++){
            name = input.nextLine();
            printInitials(name);
            //System.out.println();
        }
    }
}
