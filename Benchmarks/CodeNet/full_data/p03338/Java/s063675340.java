import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int ans = 0;
        for (int i = 1; i < n; i++) {
            Set<String> l = divide(s, 0, i);
            Set<String> r = divide(s, i, n);
            int tmp = 0;
            for (String left : l) {
                if (r.contains(left)) {
                    tmp++;
                }
            }

            ans = Math.max(tmp, ans);
        }

        System.out.println(ans);
    }

    private static Set<String> divide(String s, int i, int n) {
        char[] c = s.substring(i, n).toCharArray();
        Set<String> set = new HashSet<>();
        for (char ch : c) {
            set.add(String.valueOf(ch));
        }
        return set;
    }
}
