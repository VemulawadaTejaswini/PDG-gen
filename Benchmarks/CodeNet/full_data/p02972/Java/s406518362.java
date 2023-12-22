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
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int[] answer = new int[N];
        for (int i = N; 1 <= i; i--) {
            int sum = 0;
            for (int j = 2; i * j <= N; j++) {
                sum += A[i*j-1];
            }
            answer[i-1] = (sum + A[i-1]) % 2;
        }
        StringBuilder sb = new StringBuilder();
        int M = 0;
        for (int i = 1; i <= N; i++) {
            int t = answer[i-1];
            if (0 < t) {
                M += 1;
                sb.append(i + " ");
            }
        }
        System.out.println(M);
        if (0 < M) {
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
