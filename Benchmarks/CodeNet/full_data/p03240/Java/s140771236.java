
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }
        for (int cx = 0 ; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                boolean isCenter = true;
                int candidate = Math.abs(x[0] - cx) + Math.abs(y[0] - cy) + h[0];
                for (int i = 0 ; i < n ; i++) {
                    int div = Math.abs(x[i] - cx) + Math.abs(y[i] - cy) + h[i];
                    if (div != candidate) {
                        isCenter = false;
                    }
                }
                if (isCenter) {
                    System.out.println(cx+ " " + cy + " " + candidate);
                    return;
                }
            }
        }

    }

}