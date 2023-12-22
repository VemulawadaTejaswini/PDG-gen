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
        int M = scan.nextInt();
        boolean[] ans = new boolean[N];
        int[] count = new int[N];
        Arrays.fill(count, 1);
        ans[0] = true;
        for (int i = 0; i < M; i++) {
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            if (!ans[x]) {
                if (1 <= count[x]) {
                    count[x] -= 1;
                    count[y] += 1;
                }
                continue;
            }
            if (count[x] == 1) {
                ans[x] = false;
            }
            count[x] -= 1;
            count[y] += 1;
            ans[y] = true;
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            cnt += ans[i] ? 1 : 0;
        }
        System.out.println(cnt);
    }
}
