import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] D = new int[N + 1];
            for (int i = 0; i < N; i++) {
                D[i] = sc.nextInt();
            }
            D[N] = 0;

            int min = (int) 1e9;
            for (int i = 0; i < N + 1; i++) {
                for (int j = i + 1; j < N + 1; j++) {
                    int max = 0;
                    for (int k = 0; k < 2; k++) {
                        for (int k2 = 0; k2 < 2; k2++) {
                            int di = k == 0 ? D[i] : (24 - D[i]);
                            int dj = k2 == 0 ? D[j] : (24 - D[j]);
                            int diff = Math.abs(di - dj);
                            max = Math.max(max, Math.min(diff, 24 - diff));
                        }
                    }
                    min = Math.min(min, max);
                }
            }

            System.out.println(min);
        }
    }
}
