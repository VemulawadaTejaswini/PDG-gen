import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int b = (int) Math.pow(2, S.length() - 1);
        long ans = 0;

        for (int i = 0; i < b; i++) {
            String s = "";
            for (int j = 0; j < S.length(); j++) {
                if ((i & (1 << j)) >= 1) {
                    s += String.valueOf(S.charAt(j)) + "+";
                } else {
                    s += String.valueOf(S.charAt(j));
                }
            }
            String[] sp = s.split("\\+");
            for (int j = 0; j < sp.length; j++) {
                if (!sp[j].isEmpty()) {
                    ans += Long.parseLong(sp[j]);
                }
            }
        }
        System.out.println(ans);
    }
}