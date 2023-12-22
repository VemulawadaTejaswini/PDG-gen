import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

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
        long red = 0;
        long green = 0;
        long blue = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 'R') {
                red += 1;
            }
            if (d[i] == 'G') {
                green += 1;
            }
            if (d[i] == 'B') {
                blue += 1;
            }
        }
        long ans = red * green * blue;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (d[i] == d[j]) {
                    continue;
                }
                int k = j + j - i;
                if (N <= k) {
                    continue;
                }
                if (d[i] == d[k] || d[j] == d[k]) {
                    continue;
                }
                ans -= 1;
            }
        }
        System.out.println(ans);
    }

}
