import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int a[] = new int[26];
        int b[] = new int[26];
        boolean bre = false;
        for (int i = 0; i < 26; i++) {
            a[i] = -1;
            b[i] = -1;
        }
        for (int i = 0; i < s.length(); i++){
            if (a[s.charAt(i) - 'a'] >= 0) {
                if (a[s.charAt(i) - 'a'] != t.charAt(i) - 'a') {
                    bre = true;
                    break;
                }
            }
            if (b[t.charAt(i) - 'a'] >= 0) {
                if (b[t.charAt(i) - 'a'] != s.charAt(i) - 'a') {
                    bre = true;
                    break;
                }
            }
            if (a[s.charAt(i) - 'a'] < 0) {
                a[s.charAt(i) - 'a'] = t.charAt(i) - 'a';
            }
            if (b[t.charAt(i) - 'a'] < 0) {
                b[t.charAt(i) - 'a'] = s.charAt(i) - 'a';
            }
        }
        if (!bre) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}