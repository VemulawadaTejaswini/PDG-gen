import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        int n = c.length;
        int nown = n / 2;
        while (true) {
            boolean ok = true;
            for (int i = 0; i < nown; i++) {
                if (c[i] != c[i+nown]) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) {
                if (nown*2 == n) {
                    nown -= 1;
                    continue;
                }
                System.out.println(nown*2);
                return;
            } else {
                nown -= 1;
            }
        }
    }
}