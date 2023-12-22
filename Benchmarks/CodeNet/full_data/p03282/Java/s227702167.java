import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        char[] s = S.toCharArray();
        for (int i = 0; i < S.length(); i++) {
            if (s[i] != '1') {
                System.out.println(s[i]);
                return;
            }
        }
    }
}