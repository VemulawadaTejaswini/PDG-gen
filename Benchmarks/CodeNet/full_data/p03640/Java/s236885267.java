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
        int H = scan.nextInt();
        int W = scan.nextInt();
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        int dx = 1;
        int dy = 1;
        int current = 1;
        for (int i = 0; i < H; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < W; j++) {
                if (i % 2 == 0) {
                    sb.append(current);
                    sb.append(" ");
                    a[current - 1] -= 1;
                } else {
                    sb.insert(0, " ");
                    sb.insert(0, current);
                    a[current - 1] -= 1;
                }
                if (a[current-1] == 0) {
                    current += 1;
                }
            }
            System.out.println(sb.substring(0, sb.length()-1));
        }
    }
}
