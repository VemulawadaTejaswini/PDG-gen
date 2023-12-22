import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        sc.close();

        String ans = S.substring(0, 1);
        for (int i = 1; i < S.length(); i++) {
            if (ans.charAt(ans.length()-1) == S.charAt(i)) {
                continue;
            }
            ans += S.substring(i, i+1);
        }
        out.printf("%d\n", ans.length());
        out.flush();
    }
}
