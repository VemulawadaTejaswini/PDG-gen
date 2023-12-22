import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int N = sc.nextInt();
        int[] s = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }

        if (sum % 10 != 0) {
            System.out.println(sum);
        } else {
            Arrays.sort(s);
            int ans = sum;
            for (int i = 0; i < N; i++) {
                ans -= s[i];
                if (ans % 10 != 0) {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}