import java.util.*;

public class Main {
    static String a;
    static String b;
    static String c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        c = sc.next();

        String ans = doAction("a");
        System.out.println(ans.toUpperCase());

    }
    private static String doAction(String s) {
        String next = "";
        if ("a".equals(s)) {
            if (a.length() == 0) {
                return s;
            }
            next = a.substring(a.length()-1);
            a = a.substring(0, a.length() - 1);
        } else if ("b".equals(s)) {
            if (b.length() == 0) {
                return s;
            }
            next = b.substring(b.length()-1);
            b = b.substring(0, b.length() - 1);
        } else if ("c".equals(s)) {
            if (c.length() == 0) {
                return s;
            }
            next = c.substring(c.length()-1);
            c = c.substring(0, c.length() - 1);
        }
        return doAction(next);
    }
}