import java.util.Arrays;
import java.util.Comparator;
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

        Arrays.sort(h);
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (h[i] >= K) {
                count++;
            }
            else {
                break;
            }
        }

        System.out.println(count);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}