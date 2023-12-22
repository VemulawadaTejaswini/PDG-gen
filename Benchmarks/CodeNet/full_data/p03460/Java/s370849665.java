import java.util.*;

public class Main {

    public static int numberHopes(int N, int K, int[] x, int[] y, char[] c) {
        int white = 0;
        int black = 0;
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                int white_count = 0;
                int black_count = 0;
                for (int l = 0; l < N; l++) {
                    if ((((x[l] + i) / K) % 2 == ((y[l] + j) / K) % 2)) {
                        if (c[l] == 'W') {
                            white_count++;
                        } else {
                            black_count++;
                        }
                    } else {
                        if (c[l] == 'B') {
                            white_count++;
                        } else {
                            black_count++;
                        }
                    }
                }
                white = Math.max(white, white_count);
                black = Math.max(black, black_count);
            }
        }
        return Math.max(white, black);
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
