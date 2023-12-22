import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (h[i] >= K) {
                count++;
            }
        }

        System.out.println(count);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}