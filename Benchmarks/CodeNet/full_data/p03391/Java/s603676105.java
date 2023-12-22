import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if (a[i] == 0) {
                b[i]--;
                if (b[i] == -1) {
                    b[i]++;
                }
            } else if (b[i] == 0) {
                a[i]--;
            }
            ans += Math.abs(a[i] - b[i]);
        }

        System.out.println(ans);
    }
}