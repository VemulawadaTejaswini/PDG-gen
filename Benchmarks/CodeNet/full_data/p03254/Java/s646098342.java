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
        int N = scan.nextInt();
        long x = scan.nextLong();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
        }
        Arrays.sort(a);
        int answer = 0;
        for (int i = 0; i < N - 1; i++) {
            if (a[i] <= x) {
                answer += 1;
                x -= a[i];
                continue;
            }
            break;
        }
        if (a[N-1] == x) {
            answer += 1;
        }
        System.out.println(answer);
    }
}
