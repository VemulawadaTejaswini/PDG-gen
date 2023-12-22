import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        int hc = 0;
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
            if (h[i] != 0) {
                hc = i;
            }
        }
        for (int cx = 0 ; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                boolean isCenter = true;
                int H = Math.abs(x[hc] - cx) + Math.abs(y[hc] - cy) + h[hc];
                for (int i = 1 ; i < n ; i++) {
                    int div = Math.abs(x[i] - cx) + Math.abs(y[i] - cy);
                    if (h[i] == Math.max(H - div , 0)) {
                        isCenter = false;
                    }
                }
                if (isCenter) {
                    System.out.println(cx+ " " + cy + " " + H);
                    return;
                }
            }
        }

    }

}