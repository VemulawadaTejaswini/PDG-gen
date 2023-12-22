import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        for (int i = N - 1; i > 0; i--) {
            if (H[i - 1] > H[i]) {
                H[i - 1]--;
                if (H[i - 1] > H[i]) {
                    System.out.print("No");
                    return;
                }
            }
        }
        System.out.print("Yes");
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

