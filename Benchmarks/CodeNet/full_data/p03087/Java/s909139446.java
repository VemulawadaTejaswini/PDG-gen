import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            String str = s.substring(l - 1, r);
            int cnt = 0;
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) == 'A') {
                    if (str.charAt(j + 1) == 'C') {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
