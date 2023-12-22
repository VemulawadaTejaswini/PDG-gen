import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] a = new long[N];
        long[] b = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
        }
        for (int i = 0; i < N; i++) {
            b[i] = scan.nextLong();
        }
        long a_increment = 0;
        long b_increment = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] == b[i]) {
                continue;
            }
            if (a[i] < b[i]) {
                a_increment += (a[i] - b[i]) / 2;
                continue;
            }
            b_increment += a[i] - b[i];
        }
        a_increment += b_increment;
        if (a_increment <= 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}
