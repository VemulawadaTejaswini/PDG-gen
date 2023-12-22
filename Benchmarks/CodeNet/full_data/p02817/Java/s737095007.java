import java.util.Scanner;

public class St {

    public static String merge(String s, String t) {
        if (s.length() < 1 || s.length() > 100) {
            return null;
        }
        if (s.length() == 0 && t.length() == 0) {
            return null;
        }
        if (s.length() == 0 && t.length() != 0) {
            return t;
        }
        if (t.length() == 0 && s.length() != 0) {
            return s;
        }
        return t + s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        System.out.println(merge(s1, s2));
    }

}
