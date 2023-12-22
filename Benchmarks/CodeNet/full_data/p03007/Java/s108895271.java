import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
        }
        Arrays.sort(a);
        long current = a[0];
        for (int i = N - 2; 0 < i; i--) {
            current -= a[i];
        }
        long answer = a[N-1] - current;
        System.out.println(answer);
        current = a[0];
        for (int i = N - 2; 0 < i; i--) {
            System.out.printf("%d %d\n", current, a[i]);
            current -= a[i];
        }
        System.out.printf("%d %d\n", a[N-1], current);
    }
}