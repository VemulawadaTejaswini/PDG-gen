import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        for (int i = 0; i < S.length()/2; i++) {
            int a = S.charAt(i);
            int b = S.charAt(S.length()-1-i);
            if (a != b) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}

