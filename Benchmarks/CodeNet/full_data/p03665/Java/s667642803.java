import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(sc.next());
            if (m % 2 == 1) {
                odd++;
            } else {
                even++;
            }
        }
        long ans = 1;
        if (odd == 0) {
            if (p == 0) {
                for (int i = 0; i < n; i++) {
                    ans *= 2;
                }
            } else {
                ans = 0;
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                ans *= 2;
            }
        }
        System.out.println(ans);
    }
}