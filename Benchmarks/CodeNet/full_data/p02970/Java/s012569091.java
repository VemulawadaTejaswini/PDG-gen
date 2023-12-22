import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int D = scan.nextInt();
        System.out.println(ceil(N, 2 * D + 1));
    }
    private int ceil(int x, int y) {
        if (x % y == 0) {
            return x / y;
        }
        return x / y + 1;
    }
}
