import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int k = scanner.nextInt();
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < s.length() - 1; i++) {
            if (k >= ('{' - s.charAt(i)) % 26) {
                k -= ('{' - s.charAt(i)) % 26;
                ans.setCharAt(i, 'a');
            }
        }
        ans.setCharAt(s.length() - 1, (char)((s.charAt(s.length() - 1) - 'a' + k) % 26 + 'a'));
        System.out.println(ans);
    }
}