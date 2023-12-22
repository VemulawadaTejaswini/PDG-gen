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
        int T = scan.nextInt();
        int[] time = new int[6001];
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
            B[i] = scan.nextInt();
        }
        Arrays.fill(time, Integer.MIN_VALUE);
        time[0] = 0;
        for (int i = 0; i < N; i++) {
            int[] next_time = Arrays.copyOfRange(time, 0, time.length);
            for (int j = 0; j < T; j++) {
                if (time[j] == Integer.MIN_VALUE) {
                    continue;
                }
                next_time[j+A[i]] = Math.max(next_time[j+A[i]], time[j]+B[i]);
            }
            time = next_time;
        }
        int ans = 0;
        for (int i = 0; i < 6001; i++) {
            ans = Math.max(ans, time[i]);
        }
        System.out.println(ans);
    }
}
