import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] D = new int[N + 1];
            D[0] = 0;
            for (int i = 0; i < N; i++) {
                D[i + 1] = sc.nextInt();
            }

            Arrays.sort(D);

            int minmax = (int) 1e9;
            int[] isClockWise = new int[N + 1];
            for (int i = 1; i < N + 1; i++) {
                int max = 0;
                int maxK = -1;
                for (int k = 0; k < 2; k++) {
                    int di = k == 0 ? D[i] : (24 - D[i]);
                    int min = (int) 1e9;
                    for (int j = 0; j < i; j++) {
                        int dj = isClockWise[j] == 0 ? D[j] : (24 - D[j]);
                        int diff = Math.abs(di - dj);
                        diff = Math.min(diff, 24 - diff);
                        min = Math.min(min, diff);
                    }
                    if (min > max) {
                        max = min;
                        maxK = k;
                    }
                }
                isClockWise[i] = maxK;
                minmax = Math.min(minmax, max);
            }
            System.out.println(minmax);
        }
    }
}
