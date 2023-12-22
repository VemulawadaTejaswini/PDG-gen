import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            b[i] = scan.nextInt();
        }
        int b_increment = 0;
        for (int i = 0; i < N; i++) {
            if (b[i] < a[i]) {
                b_increment += a[i] - b[i];
                b[i] += a[i] - b[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (a[i] < b[i]) {
                int k = (b[i] - a[i]) / 2;
                b_increment -= k;
                a[i] += 2 * k;
                if (a[i] < b[i]) {
                    a[i] += 2;
                    b[i] += 1;
                }
            }
        }
        if (b_increment <= 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
