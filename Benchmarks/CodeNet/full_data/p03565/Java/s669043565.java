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
        String Sd = sc.next();
        String T = sc.next();
        char[] sd = Sd.toCharArray();
        char[] t = T.toCharArray();
        int tlen = t.length;
        String tmp = "";
        int tleft = 9999;
        for (int i = Sd.length() - 1;;) {
            int left = i - tlen + 1;
            if (left < 0) {
                break;
            }

            if (check(left, i, sd, t)) {
                tmp = new String(t);
                tleft = left;
                break;
            }
            i--;
        }

        if (tleft == 9999) {
            System.out.println("UNRESTORABLE");
        } else {
            // System.out.println(Sd.substring(0, tleft).replaceAll("\\?", "a")
            // + tmp);
            StringBuilder sb = new StringBuilder();
            sb.append(Sd);
            sb.replace(tleft, tleft + tlen, tmp);
            System.out.println(sb.toString().replaceAll("\\?", "a"));
        }
    }

    boolean check(int s, int g, char[] sd, char[] t) {
        int ti = 0;
        for (int i = s; i <= g; i++) {
            if (sd[i] != '?' && sd[i] != t[ti]) {
                return false;
            }
            ti++;
        }
        return true;
    }
}
