import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();
    }

    private void solve() {
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int ans = X;
        for (int i = 0; i < N; i++) {
            ans += 1;
            int A = sc.nextInt();
            ans += (D - 1) / A;
        }

        System.out.println(ans);
    }
}