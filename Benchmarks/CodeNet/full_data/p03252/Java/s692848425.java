import java.util.*;

public class Main {
    
    long INF = Long.MAX_VALUE;
    
    public static void main(String[] args) {
        new Main().solve();
    }
    
    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] s1 = S.toCharArray();
        Arrays.sort(s1);
        char[] t = T.toCharArray();
        char[] t1 = T.toCharArray();
        Arrays.sort(t1);
        int c1 = 1;
        int c2 = 1;
        for (int i = 1; i < S.length(); i++) {
            if (s[i] != s[i - 1]) {
                c1++;
            }
            if (t[i] != t[i - 1]) {
                c2++;
            }
        }
        if (c1 != c2) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < S.length(); i++) {
            String str1 = S.replaceAll(String.valueOf(s[i]), "");
            str1 = str1.replaceAll(String.valueOf(t[i]), "");
            String str2 = T.replaceAll(String.valueOf(s[i]), "");
            str2 = str2.replaceAll(String.valueOf(t[i]), "");
            if (str1.length() != str2.length()) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
