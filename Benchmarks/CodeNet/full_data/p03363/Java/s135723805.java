
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
        Arrays.sort(AB);
        lavel:
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (AB[i] == AB[j]) {
                    ans++;
                } else {
                    continue lavel;
                }
            }
        }
        System.out.println(ans);
    }
}