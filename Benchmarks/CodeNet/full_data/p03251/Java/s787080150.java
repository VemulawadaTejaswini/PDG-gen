import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] X = new int[n];
        int[] Y = new int[m];
        for (int i = 0 ; i < n ; i++) {
            X[i] = sc.nextInt();
        }
        for (int i = 0 ; i < m ; i++) {
            Y[i] = sc.nextInt();
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        int xmax = X[n-1];
        int ymin = Y[0];
        if (xmax < ymin && x < xmax && y > ymin) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }

//        System.out.println("War");
//        System.out.println("No War");
    }

}