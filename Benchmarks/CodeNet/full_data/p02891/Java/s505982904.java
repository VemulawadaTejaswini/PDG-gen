import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        char[] s = S.toCharArray();
        char tmp = 0;
        char first = 0;
        char last = 0;
        long count = 0;
        boolean db = true;
        boolean lst = false;
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            if (i == 0) {
                first = c;
            } else if (i == s.length-1) {
                last = c;
            }
            if (tmp == c && db) {
                count++;
                db = false;
                if (i == s.length-1) {
                    lst = true;
                }
            } else if (!db) {
                db = true;
            }
            tmp = c;
        }
        if (!lst && first == last) {
            System.out.println(count*K + (K-1));
        } else {
            System.out.println(count*K);
        }
    }
}