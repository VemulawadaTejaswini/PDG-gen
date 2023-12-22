import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long[] H = new long[N];
        for (int i = 0; i < N; i++) {
            H[i] = scan.nextLong();
        }
        H[0] -= 1;
        boolean solve = true;
        for (int i = 1; i < N; i++) {
            if (H[i-1] < H[i]) {
                H[i] -= 1;
            }
            if (H[i]<H[i-1]) {
                solve = false;
                break;
            }
        }
        System.out.println(solve ? "YES" : "NO");
    }
}
