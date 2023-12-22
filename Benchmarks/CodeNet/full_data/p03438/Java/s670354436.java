import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan;

    private static void start() {
        scan = new Scanner(java.lang.System.in);
    }

    private static void finish() {
    }


    public static void main(String[] args) {
        start();

        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] - a[i] > 0) {
                sumA += b[i] - a[i];
            }
            if (a[i] - b[i] > 0) {
                sumB += a[i] - b[i];
            }
        }
        if (sumA % sumB == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        finish();
    }
}
