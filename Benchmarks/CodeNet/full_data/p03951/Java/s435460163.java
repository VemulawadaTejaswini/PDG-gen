import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        if (s.equals(t)) {
            System.out.println(s.length());
            return;
        }

        int p = 0;
        while (p <= n) {
            char s1 = s.charAt(s.length() - p - 1);
            char t1 = t.charAt(p);
            if (s1 != t1) {
                System.out.println(2 * n - p);
                return;
            }
            p++;

        }

    }
}