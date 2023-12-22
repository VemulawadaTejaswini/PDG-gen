import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        String S = sc.next();

        boolean[] used = new boolean[26];

        String ans = "yes";
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (used[c - 'a']) {
                ans = "no";
                break;
            }
            used[c - 'a'] = true;
        }

        System.out.println(ans);
    }
}
