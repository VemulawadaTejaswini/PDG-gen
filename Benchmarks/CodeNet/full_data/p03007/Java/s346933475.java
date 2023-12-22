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
        long sum = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
            sum += a[i];
        }
        Arrays.sort(a);
        long answer = sum - a[0] * 2;
        System.out.println(answer);
        long current = a[0];
        for (int i = N - 2; 0 < i; i--) {
            System.out.println(current + " " + a[i]);
            current -= a[i];
        }
        System.out.println(a[N-1] + " " + current);
    }
}