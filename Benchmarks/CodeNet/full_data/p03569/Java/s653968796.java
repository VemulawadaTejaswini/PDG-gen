import java.util.Scanner;

public class Main {
    static Scanner in;

    void solve() {
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s.replace("x", ""));
        String s2 = sb.toString();
        if (s.equals(s2)) {
            System.out.println(0);
            return;
        }
        if (!s.replace("x", "").equals(s2)) {
            System.out.println(-1);
            return;
        }
        int ans = 0;
        while (s.length() > 1) {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                s = s.substring(1, s.length() - 1);
            } else {
                if (s.charAt(0) == 'x') {
                    s = s + "x";
                    ans++;
                } else if (s.charAt(s.length() - 1) == 'x') {
                    s = "x" + s;
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        new Main().solve();
    }
}
