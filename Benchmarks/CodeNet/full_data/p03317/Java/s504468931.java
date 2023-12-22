import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        int ans = 0;
        int c = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] == 1) {
                ans = i + 1;
            }
        }
        int A1 = (ans - 1) / (K - 1);
        int A2 = (N - ans + 1) / (K - 1);
        if (ans == 1 || ans == N) {
            A1 = 0;
            A2 = (N - 1) / (K - 1);
            if ((N - 1) % (K - 1) != 0) {
                A2++;
            }
        }
        System.out.println(A1 + A2);
    }

}