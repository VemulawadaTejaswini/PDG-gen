import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer ans = new StringBuffer(sc.next());
        int q = sc.nextInt();
        int t = 0;
        int f = 0;
        String c = "";
        for (int i = 0; i < q; i++) {
            t = sc.nextInt();
            if (t == 1) {
                ans = ans.reverse();
            } else {
                f = sc.nextInt();
                c = sc.next();
                if (f == 1) {
                    ans.insert(0, c);
                } else {
                    ans.append(c);
                }
            }
        }
        System.out.println(ans);
    }
}