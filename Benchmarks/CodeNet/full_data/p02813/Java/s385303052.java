
import java.util.Scanner;

public class Main {

    static int a = 0;
    static int b = 0;
    static int count = 0;

    static String p;
    static String q;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        StringBuilder sbp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbp.append(scan.next());
        }
        p = sbp.toString();
        StringBuilder sbq = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbq.append(scan.next());
        }
        q = sbq.toString();
        scan.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }

        permutation(sb.toString(), "");

        System.out.println(Math.abs(a - b));
    }

    private static void permutation(String s, String ans) {
        if (s.length() == 1) {
            count++;
            String perm = ans + s;
            if (perm.equals(p)) {
                a = count;
            }
            if (perm.equals(q)) {
                b = count;
            }
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
        }
    }

}
