import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        char[] s = S.toCharArray();
        char tmp = 0;
        boolean key = false;
        long count = 0;
        char one = s[0];
        boolean ok = true;
        for (int i = 1; i < s.length; i++) {
            if (s[i] != one) {
                ok = false;
            }
        }
        if (ok) {
            System.out.println(K*s.length/2);
            return;
        }
        for (char c : s) {
            if (!key && c == tmp) {
                key = true;
                count++;
            } else if (key) {
                key = false;
            }
            tmp = c;
        }
        long count2 = 0;
        for (char c : s) {
            if (!key && c == tmp) {
                key = true;
                count2++;
            } else if (key) {
                key = false;
            }
            tmp = c;
        }
        for (char c : s) {
            if (!key && c == tmp) {
                key = true;
                count2++;
            } else if (key) {
                key = false;
            }
            tmp = c;
        }
        if (K == 1) {
            System.out.println(count);
        } else {
            System.out.println(count + (count2-count)*(K-1));
        }
    }
}