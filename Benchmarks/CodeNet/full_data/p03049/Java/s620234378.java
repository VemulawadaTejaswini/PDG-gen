import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int ans = 0;
        int a = 0;
        int b = 0;
        int ab = 0;
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j - 1) == 'A' && s.charAt(j) == 'B') {
                    ans++;
                }
            }
            if (s.charAt(s.length() - 1) == 'A') {
                if (s.charAt(0) == 'B') {
                    ab++;
                } else {
                    a++;
                }
            } else if (s.charAt(0) == 'B') {
                b++;
            }
        }

        if (a == 0 && ab > 0) {
            ab--;
            a++;
        }

        if (b == 0 && ab > 0) {
            ab--;
            b++;
        }

        System.out.println(ans + Math.min(a, b) + ab);
    }
}