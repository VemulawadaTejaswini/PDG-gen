import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        long ans = 0;
        for (int i = 0; i < (1 << (n - 1)); i++) {
            int l = 0;
            for (int j = 0; j < n - 1; j++) {
                if ((i & (1 << j)) == 0) continue;
                String sub = s.substring(l, j + 1);
                long add = Long.parseLong(sub);
                ans += add;
                l = j + 1;
            }
            String f = s.substring(l, s.length());
            long a = Long.parseLong(f);
            ans += a;
        }
        System.out.println(ans);
    }
}