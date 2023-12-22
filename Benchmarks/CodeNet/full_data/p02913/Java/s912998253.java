import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        int ans = 0;
        for (int position = 0; position < N; position++) {
            int[] Z = new int[N-position];
            int i = 1;
            int j = 0;
            Z[0] = N-position;
            int max = 0;
            while (i < N-position) {
                while (j < i && i + j < N-position && d[position+j] == d[position+i + j]) {
                    j += 1;
                }
                Z[i] = j;
                max = Math.max(max, Z[i]);
                if (j == 0) {
                    i += 1;
                    continue;
                }
                int k = 1;
                while (k < j && k + Z[k] < j) {
                    Z[i + k] = Z[k];
                    k += 1;
                }
                i += k;
                j -= k;
            }
            ans = Math.max(ans, max);
        }
        System.out.println(ans);
    }
}
