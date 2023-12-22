import java.util.*;
import java.io.*;

public class Main {

    static int limit, n;
    static String string;

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(in.readLine());
            n = Integer.parseInt(st.nextToken());
            limit = Integer.parseInt(st.nextToken());

            string = in.readLine();

            int left = 0;
            int right = string.length();

            while (right-left > 3) {
                int mid = ((right+left)/2)+1;
                if (isValid(mid)) {
                    left = mid;
                } else {
                    right = mid;
                }
            }

            for (int i = right; i >= left; i--) {
                if (isValid(i)) {
                    System.out.println(i);
                    return;
                }
            }
        } catch (IOException ex) {

        }
    }

    public static boolean isValid(int x) {
        for (int i = 0; i < string.length(); i++) {
            if (i + x > string.length()) {
                break;
            }
            String sub = string.substring(i, i+x);
            String[] splits = sub.split("1");
            int parts = 0;
            for (String string : splits) {
                if (string.length() > 0) {
                    parts++;
                }
            }
            if (parts <= limit) {
                return true;
            }
        }
        return false;
    }

}