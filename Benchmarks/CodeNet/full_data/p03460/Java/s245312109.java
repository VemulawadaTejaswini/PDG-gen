import java.util.*;

public class Main {

    public static int numberHopes(int N, int K, int[] x, int[] y, char[] c) {
        int max = 0;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                int count = 0;
                for (int l = 0; l < N; l++) {
                    if ((((x[l] + i) / K) % 2 == ((y[l] + j) / K) % 2)) {
                        if (c[l] == 'W') {
                            count++;
                        }
                    } else {
                        if (c[l] == 'B') {
                            count++;
                        }
                    }
                }
                max = Math.max(max, Math.max(count, N - count));
                if (max == N) {
                    return max;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        char[] c = new char[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            c[i] = sc.next().charAt(0);
        }
        System.out.println(numberHopes(N, K, x, y, c));
    }

}
