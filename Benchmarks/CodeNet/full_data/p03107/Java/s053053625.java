import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        int N = S.length();
        String before  = S;
        String after = S;
        while (true) {
            after = step(before);
            if (before.equals(after)) {
                break;
            }
            before = after;
        }
        System.out.println(S.length() - after.length());
    }
    public static String step(String S) {
        char[] data = S.toCharArray();
        StringBuffer sb = new StringBuffer();
        if (data.length == 1) {
            return S;
        }
        for (int i = 0; i < data.length; i++) {
            if (i == data.length - 1) {
                sb.append(data[i]);
                continue;
            }
            if (data[i] == data[i+1]) {
                sb.append(data[i]);
                continue;
            }
            i += 1;
        }
        return sb.toString();
    }
}
