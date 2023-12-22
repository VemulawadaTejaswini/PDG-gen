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
        int M = scan.nextInt();
        int[] d = new int[N];
        for (int i = 0; i < M; i++) {
            d[scan.nextInt()-1] += 1;
            d[scan.nextInt()-1] += 1;
        }
        boolean ans = true;
        for (int i = 0; i < N; i++) {
            if (d[i] % 2 == 1) {
                ans = false;
                break;
            }
        }
        System.out.println(ans ? "YES" : "NO");
    }
}
