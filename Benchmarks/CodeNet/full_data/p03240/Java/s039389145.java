import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            H[i] = sc.nextInt();
        }

        for (int i = 0; i <= 100; i++) {
            NEXT: for (int j = 0; j <= 100; j++) {

                int h = -1;
                int maxh = Integer.MAX_VALUE;

                for (int k = 0; k < N; k++) {
                    if (h == -1) {
                        if (H[k] > 0) {
                            h = H[k] + Math.abs(X[k] - j) + Math.abs(Y[k] - i);
                        } else {
                            maxh = Math.min(maxh, H[k] + Math.abs(X[k] - j) + Math.abs(Y[k] - i));
                        }

                        continue;
                    }

                    if (h != H[k] + Math.abs(X[k] - j) + Math.abs(Y[k] - i)) continue NEXT;
                }

                if (h == -1) h = maxh;
                System.out.println(String.format("%d %d %d", j, i, h));
            }
        }
    }
}