import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = new StringBuilder(br.readLine()).reverse().toString();
        boolean b = false;
        int cnt = 0;
        while (true) {
            if (s.length() == cnt) {
                b = true;
                break;
            }
            if (s.indexOf("remaerd") == cnt) {
                cnt += 7;
            } else if (s.indexOf("maerd") == cnt) {
                cnt += 5;
            } else if (s.indexOf("resare") == cnt) {
                cnt += 6;
            } else if (s.indexOf("esare") == cnt) {
                cnt += 5;
            } else {
                break;
            }
        }
        System.out.println(b ? "YES" : "NO");
    }
}