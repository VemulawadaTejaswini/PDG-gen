import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] x = new int[N + 1];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
            }
            x[N] = 0;
            Arrays.sort(x);

            int index0 = 0;
            for (int i = 0; i < N + 1; i++) {
                if (x[i] == 0) {
                    index0 = i;
                    break;
                }
            }

            int min = (int) 1e9;
            for (int i = 0; i <= K; i++) {
                if (index0 - i >= 0 && index0 + (K - i) < x.length) {
                    min = Math.min(min, 2 * Math.abs(x[index0 - i]) + Math.abs(x[index0 + (K - i)]));
                }
                if (index0 - (K - i) >= 0 && index0 + i < x.length) {
                    min = Math.min(min, Math.abs(x[index0 - (K - i)]) + 2 * Math.abs(x[index0 + i]));
                }
            }

            System.out.println(min);
        }
    }
}
