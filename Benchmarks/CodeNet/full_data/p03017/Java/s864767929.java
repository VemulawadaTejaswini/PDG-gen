import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int a = scanner.nextInt() - 1;
        int b = scanner.nextInt() - 1;
        int c = scanner.nextInt() - 1;
        int d = scanner.nextInt() - 1;
        String s = scanner.next();

        System.out.println(f(n, a, b, c, d, s) ? "Yes" : "No");
    }

    static boolean f(int n, int a, int b, int c, int d, String s) {
        boolean before = false;
        for (char ch : s.substring(a, c).toCharArray()) {
            if (before && ch == '#') {
                return false;
            }
            before = ch == '#';
        }
        before = false;
        for (char ch : s.substring(b, d).toCharArray()) {
            if (before && ch == '#') {
                return false;
            }
            before = ch == '#';
        }

        if (c > d) {
            String t = s.substring(a, c + 1);
            int count = 0;
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == '.') {
                    count++;
                } else {
                    if (count >= 3) {
                        return true;
                    }
                    count = 0;
                }
            }
            return false;
        }
        return true;
    }
}