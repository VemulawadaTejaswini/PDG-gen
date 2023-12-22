import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();

        if (s.length() < t.length()) {
            System.out.println("UNRESTORABLE");
            return;
        }

        for (int i = s.length() - t.length(); i >= 0; i--) {
            String sub = s.substring(i, i + t.length());
            if (!canSame(sub, t)) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                if (j >= i && j < i + t.length()) {
                    System.out.print(t.charAt(j - i));
                } else if (s.charAt(j) == '?') {
                    System.out.print('a');
                } else {
                    System.out.print(s.charAt(j));
                }
            }
            return;
        }

        System.out.println("UNRESTORABLE");
    }

    static boolean canSame(String s, String t) {
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(i) == '?') {
                continue;
            }
            if (s.charAt(i) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
