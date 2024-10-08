import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        prim();
        fibo(10);
    }
//1. feladat
    public static void prim() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg a csaoki gyártási számát: ");
        int darab = scanner.nextInt();
        boolean vanoszto = false;

        for (int i = 2; i < darab; i++)
        {
            if(darab % i == 0)
            {
                vanoszto = true;
                break;
            }

        }

        if (!vanoszto) {
            System.out.println("Gratulálunk, nyert!");
        }

        else {
            System.out.println("Sajnos nem nyert");
        }
    };

    //2.feladat

    public static int fibo(int n) {
        ArrayList<Integer> szamok = new ArrayList<>();

        szamok.add(0);
        szamok.add(1);

        for(int i = 2; i < n; i++){
            int elozoelotti = szamok.get(i-2);
            int elozo = szamok.get(i-1);
            szamok.add(elozoelotti+elozo);
        }

        System.out.println("szamok: "+szamok);
        return  szamok.get(n);
    }
}


