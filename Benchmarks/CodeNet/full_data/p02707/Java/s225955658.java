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
        int[] A = new int[N];
        A[0] = -1;
        for (int i = 1; i < N; i++) {
            A[i] = scan.nextInt()-1;
        }
        int[] ans = new int[N];
        for (int i = N-1; 0 <= i; i--) {
            int current = i;
            int boss = boss(A, current);
            if (boss == -1) {
                continue;
            }
            ans[boss] += 1;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(ans[i]);
        }
    }
    private int boss(int[] A, int current) {
        return A[current];
    }
}
