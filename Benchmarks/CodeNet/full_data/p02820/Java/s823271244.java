import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        String T = sc.next();

        String A = "";
        int ans = 0;
        for (int i = 0; i < N; i++) {
            char c = T.charAt(i);
            char d = i >= K ? A.charAt(i-K) : 'a';
            if (c == 'r' && d != 'p') {
                ans += P;
                A += "p";
            } else if (c == 's' && d != 'r') {
                ans += R;
                A += "r";
            } else if (c == 'p' && d != 's') {
                ans += S;
                A += "s";
            } else {
                // ans += 0;
                A += "a";
            }
            // System.out.println(A);
        }

        System.out.println(ans);
    }
}
