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
        int[] h = new int[200001];
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            int a = scan.nextInt();
            A[i] = a;
            h[a] += 1;
        }
        int max_first = 0;
        int max_second = 0;

        for (int i = 200000; 0 < i; i--) {
            if (h[i] == 0) {
                continue;
            }
            if (max_first == 0) {
                max_first = i;
                if (h[i] == 1) {
                    continue;
                }
            }
            if (max_second == 0) {
                max_second = i;
                break;
            }
        }
        for (int i = 0; i < N; i++) {
            if (A[i] == max_first) {
                System.out.println(max_second);
            } else {
                System.out.println(max_first);
            }
        }
    }
}
