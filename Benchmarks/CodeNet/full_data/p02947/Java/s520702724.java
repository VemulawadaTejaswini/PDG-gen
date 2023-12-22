import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        
        for (int i = 0; i < n; i++) {
            char[] c = sc.next().toCharArray();
            Arrays.sort(c);
            s[i] = new String(c);
        }
        
        Arrays.sort(s);
        
        int cnt = 1, ans = 0;;
        boolean same;
        for (int i = 1; i < n; i++) {
            if (s[i].equals(s[i - 1])) {
                same = true;
                cnt++;
            } else {
                same = false;
                ans += cnt * (cnt - 1) / 2;
                cnt = 1;
            }
        }
        ans += cnt * (cnt - 1) / 2;
        System.out.println(ans);
    }
}
