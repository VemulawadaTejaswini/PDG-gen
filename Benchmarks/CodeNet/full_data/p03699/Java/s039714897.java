import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s[] = new int[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            s[i] = sc.nextInt();
            ans += s[i];
        }
        if (ans % 10 != 0) {
            System.out.println(ans);
            return;
        } else {
            Arrays.sort(s);
            for (int i = 0; i < N; i++) {
                if (s[i] % 10 != 0) {
                    ans -= s[i];
                    System.out.println(ans);
                    return;
                }
            }
            System.out.println("0");
            return;

        }

    }
}
