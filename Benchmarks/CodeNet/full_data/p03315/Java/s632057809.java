import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.next();
        sc.close();

        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '+') {
                ans++;
            } else {
                ans--;
            }
        }
        out.printf("%d\n", ans);
        out.flush();
    }
}
