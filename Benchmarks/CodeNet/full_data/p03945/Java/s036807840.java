
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        new Main().solve();
    }
    
    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] s = S.toCharArray();
        int l = 0;
        for (int i = 1; i < S.length(); i++) {
            if (s[i - 1] != s[i]) {
                l++;
            }
        }
        int r = 0;
        for (int i = S.length() - 2; i >= 0; i--) {
            if (s[i + 1] != s[i]) {
                r++;
            }
        }
        System.out.println(Math.min(l, r));
    }
}
