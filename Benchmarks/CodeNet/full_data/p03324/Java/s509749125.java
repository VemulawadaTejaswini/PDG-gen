import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int c = 0;
        for (int i = 1; i < 10000000; i++) {
            if (i % (int) Math.pow(100, D) == 0 && i % (int) Math.pow(100, D + 1) != 0) {
                c++;
            }
            if (c == N) {
                System.out.println(i);
                return;
            }
        }
    }
}