import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int K = scan.nextInt();
        int T = scan.nextInt();
        int[] a = new int[T];
        for (int i = 0; i < T; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a);
        int max = T-1;
        for (int i = 0; i < T-1; i++) {
            if (a[i] == 0) {
                continue;
            }
            while (0 < a[i]) {
                if (a[i] < a[max]) {
                    a[max] -= a[i];
                    a[i] = 0;
                    continue;
                }
                a[i] -= a[max];
                a[max] = 0;
                max -= 1;
            }
        }
        System.out.println(Math.max(0, a[max]-1));
    }
}
