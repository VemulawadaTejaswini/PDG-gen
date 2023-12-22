import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] to = new int[26];
        int[] ds = new int[26];
        for (int i = 0; i < 26; i++) {
            to[i] = -1;
            ds[i] = -1;
        }
        String s = sc.next();
        String t = sc.next();
        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            int b = t.charAt(i) - 'a';

            if (to[a] == -1) {
                to[a] = b;
            }
            if (ds[b] == -1) {
                ds[b] = a;
            }
            if (to[a] != b || ds[b] != a) {
                ok = false;
                break;
            }
        }
        System.out.println(ok ? "Yes" : "No");
    }

}
