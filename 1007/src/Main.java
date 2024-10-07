import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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

        if (vanoszto) {
            System.out.println("Sajnos nem nyert! ");
        }

        else {
            System.out.println("Gratulálunk, nyert :)");
        }
    }
}


