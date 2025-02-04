import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        int[] H = new int[N];

        int xbase = -1;
        int ybase = -1;
        int hbase = -1;

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            H[i] = sc.nextInt();

            if (H[i] > 0) {
                hbase = H[i];
                xbase = X[i];
                ybase = Y[i];
            }
        }

        for (int i = 0; i <= 100; i++) {
            NEXT: for (int j = 0; j <= 100; j++) {
                int height = hbase + Math.abs(xbase - j) + Math.abs(ybase - i);

                for (int k = 0; k < N; k++) {
                    if (H[k] != Math.max(0, height - Math.abs(j - X[k]) - Math.abs(i - Y[k]))) continue NEXT;
                }

                System.out.println(String.format("%d %d %d", j, i, height));
                return;
            }
        }
    }
}