import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S2 = in.next();
            String T = in.next();

            boolean match = false;
            String S = "";
            for (int i = 0; i < S2.length(); i++) {
                if (match == false && match(S2, i, T)) {
                    match = true;
                    S += T;
                    i += T.length();
                    i--;
                    // break;
                    continue;
                }
                if (S2.charAt(i) == '?') {
                    S += 'a';
                } else {
                    S += S2.charAt(i);
                }
            }

            if (match) {
                System.out.println(S);
            } else {
                System.out.println("UNRESTORABLE");
            }
        }
    }

    private static boolean match(String s2, int i, String t) {
        for (int k = 0; k < t.length(); k++) {
            if (i + k >= s2.length()) {
                return false;
            }

            if (s2.charAt(i + k) == t.charAt(k)) {

            } else if (s2.charAt(i + k) == '?') {

            } else {
                return false;
            }
        }
        return true;
    }
}
