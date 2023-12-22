import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String N = sc.next();
        String ans = "";
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '1') {
                ans += "9";
            } else if (N.charAt(i) == '9') {
                ans += "1";
            } else {
                ans += N.substring(i, i+1);
            }
        }
        out.printf("%s\n", ans);
        out.flush();
    }
}
