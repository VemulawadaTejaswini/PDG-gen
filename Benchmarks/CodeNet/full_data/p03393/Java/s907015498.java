import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Set set = new HashSet<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            set.add(c);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            if (!set.contains(c)) {
                System.out.println(s + c);
                return;
            }
        }

        while (s.length() > 1) {
            s = s.substring(0, s.length() - 1);
            set = new HashSet<Character>();
            chars = s.toCharArray();
            for (char c : chars) {
                set.add(c);
            }
            for (char c = (char) (chars[chars.length - 1] + 1); c <= 'z'; c++) {
                if (!set.contains(c)) {
                    chars[chars.length - 1] = c;
                    System.out.println(new String(chars));
                    return;
                }
            }
        }

        System.out.println("-1");
    }
}
