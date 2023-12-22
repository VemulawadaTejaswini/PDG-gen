import java.util.Scanner;

public class Main {

    public static void main (String argv[]){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // Upper
        int [] upper = new int[n];

        for (int i = 0; i < n; i++){
            upper[i] = scan.nextInt();
        }

        // Middle
        int [] middle = new int[n];

        for (int i = 0; i < n; i++){
            middle[i] = scan.nextInt();
        }

        // Lower
        int [] lower = new int[n];

        for (int i = 0; i < n; i++){
            lower[i] = scan.nextInt();
        }

        int nbPossible = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    if (isValid(upper[i], middle[j], lower[k])){
                        nbPossible++;
                    }
                }
            }
        }

        System.out.println(nbPossible);
    }

    public static boolean isValid (int a, int b, int c){
        return a < b && b < c;
    }

}
