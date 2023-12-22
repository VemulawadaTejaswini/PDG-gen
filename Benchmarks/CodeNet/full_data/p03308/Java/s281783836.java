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
        int a = 999999999;
        int b = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            a = Math.min(a, A[i]);
            b = Math.max(b, A[i]);
        }
        System.out.println(b - a);
    }
}