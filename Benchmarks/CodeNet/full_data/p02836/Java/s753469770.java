import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        String S = nextString(r);
        int len = S.length();
        int ans = 0;
        for (int i = 0; i < len/2; i++) {
            if (S.charAt(i) != S.charAt(len-i-1)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    public static String nextString(InputStreamReader r) throws Exception {
        String str = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            str += (char)c;
        }
        return str;
    }
}
