import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int ls[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(ls[i], 0);
            int k = in.nextInt();
            for (int j = 0; j < k; j++) {
                ls[i][j] = in.nextInt();
            }
        }

        int p[] = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = in.nextInt();
        }

        int count = 0;
        for (int comb = 0; comb <= powLong(2, n) - 1; comb++) {
            boolean all = true;
            for (int i = 0; i < m; i++) {
                int j = 0;
                int light = 0;
                while (j < n && ls[i][j] != 0) {
                    int pos = ls[i][j];
                    if (((comb >> (pos - 1)) & 0x1) == 1) {
                        light++;
                    }
                    j++;
                }

                if (light % 2 != p[i]) {
                    all = false;
                    break;
                }
            }

            if (all) {
                count++;
            }
        }

        System.out.println(count);
    }

    static final long powLong(long a, long e) {
        long r = 1;
        while (e > 0) {
            if ((e & 1) == 1) {
                r *= a;
            }
            e = e >> 1;
            a *= a;
        }

        return r;
    }
}
