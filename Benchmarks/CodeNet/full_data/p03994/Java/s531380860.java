
import java.util.Scanner;

public class Main {
    int n;
    char[] ss;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        ss = sc.nextLine().toCharArray();
        n = sc.nextInt();
    }

    private void solve() {
        for (int i = 0; i < ss.length - 1; i++) {
            char c = ss[i];
            int k = ('z' - c) + 1;
            if (k <= n) {
                ss[i] = 'a';
                n -= k;
            }
        }
        char c = ss[ss.length-1];
        n %= 26;
        if (n >= 'z' - c + 1) {
            ss[ss.length-1] = (char) ('a' + (n - 'z' + c - 1) % 26);
        }
        else {
            ss[ss.length-1] = (char) (c + n);
        }
        System.out.println(String.valueOf(ss));
    }
}
