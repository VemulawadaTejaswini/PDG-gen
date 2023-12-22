import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] AB = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (i > 0) {
                AB[i] = A[i] + AB[i - 1];
            } else {
                AB[i] = A[i];
            }
            if (AB[i] == 0) {
                ans++;
            }
        }
        for (int i = N - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (AB[i] - AB[j] == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}