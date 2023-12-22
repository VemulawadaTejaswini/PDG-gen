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
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] != i + 1) {
                count += 1;
            }
        }
        if (count == 0 || count == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
