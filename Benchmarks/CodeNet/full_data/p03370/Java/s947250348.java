import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int sum = 0;
        int[] m = new int[N];
        for (int i = 0; i < N; i++) {
            m[i] = sc.nextInt();
            sum += m[i];
        }
        Arrays.sort(m);
        X = X - sum;
        System.out.println(N + X / m[0]);
    }
}
