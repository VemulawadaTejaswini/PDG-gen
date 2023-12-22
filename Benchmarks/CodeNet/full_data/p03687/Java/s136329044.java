import org.omg.CORBA.MARSHAL;

import java.util.*;

public class Main {
    //-------------------------------------------------------------//
    public static final void main(String[] args) {
        new Main().solve();
    }
    //-------------------------------------------------------------//
    private final Scanner sc = new Scanner(System.in);

    void solve() {
        char[] s = sc.next().toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            set.add(s[i]);
        }

        int ans = Integer.MAX_VALUE;
        for (char c = 'a'; c <= 'z'; c++) {
            if (set.contains(c)) {
                int count = 0;
                int maxCount = 0;
                for (int i = 0; i < s.length; i++) {
                    if (s[i] != c) count++;
                    if (s[i] == c) {
                        maxCount = Math.max(maxCount, count);
                        count = 0;
                    }
                }
                maxCount = Math.max(maxCount, count);
                ans = Math.min(ans, maxCount);
            }
        }
        System.out.println(ans);
    }
}