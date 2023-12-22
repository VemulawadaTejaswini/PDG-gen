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
        String s = scan.next();
        String t = scan.next();
        if (s.equals(t)) {
            System.out.println(N);
            return;
        }
        char[] d_s = s.toCharArray();
        char[] d_t = t.toCharArray();
        int answer = 2 * N;
        for (int i = 0; i < N; i++) {
            if (d_t[i] == d_s[N-i-1]) {
                answer -= 1;
                continue;
            }
            break;
        }
        System.out.println(answer);
    }
}
