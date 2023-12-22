import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }

        int[] D = new int[N + 1];
        D[0] = 0;

        int count = 1;
        for (int i = 1; i <= N; i++) {
            D[i] = D[i - 1] + L[i - 1];
            if (D[i] <= X) {
                count++;
            }
            else {
                break;
            }
        }
        System.out.print(count);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }

}
