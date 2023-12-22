import java.util.Arrays;
import java.util.Scanner;

class A {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final char[] s = sc.next().toCharArray();
        final boolean[] used = new boolean[128];
        for (int i = 0; i < s.length; i++)
            used[s[i]] = true;
        for (int i = 'a'; i <= 'z'; i++)
            if (!used[i]) {
                System.out.println(new String(s) + (char) i);
                return;
            }
        for (int i = s.length - 1; i >= 0; i--) {
            Arrays.fill(used, false);
            for (int j = 0; j < i; j++)
                used[s[j]] = true;
            for (int j = s[i] + 1; j <= 'z'; j++)
                if (!used[j]) {
                    s[i] = (char) j;
                    System.out.println(new String(s, 0, i + 1));
                    return;
                }
        }
        System.out.println(-1);
    }
}
public class Main {
    public static void main(String...args) {
        A.main();
    }
}
