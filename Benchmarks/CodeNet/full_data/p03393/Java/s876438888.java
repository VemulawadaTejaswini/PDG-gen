import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = -1;
        char[] ab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean[] flg = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (s.charAt(i) == ab[j]) {
                    flg[j] = true;
                    if (i == s.length() - 2) {
                        n = j;
                    }
                }
            }
        }
        if (s.length() == 26) {
            System.out.println(-1);
        } else if (s.length() == 25 || s.charAt(s.length() - 1) == ab[25]) {
            System.out.print(s);
            for (int i = 0; i < 26; i++) {
                if (flg[i] == false) {
                    System.out.println(ab[i]);
                    break;
                }
            }
        } else {
            int m = 26;
            for (int i = 0; i < 26; i++) {
                if (flg[i] == false) {
                    m = i;
                    break;
                }
            }
            if (n < m) {
                System.out.print(s.substring(0, s.length() - 1));
                System.out.println(ab[m]);
            } else {
                System.out.println(s + ab[m]);
            }
        }
    }
}
