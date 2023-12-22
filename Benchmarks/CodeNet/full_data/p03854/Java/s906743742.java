import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        StringBuilder current = new StringBuilder(s).reverse();
        current = remove(current, "resare");
        current = remove(current, "esare");
        current = remove(current, "remaerd");
        current = remove(current, "maerd");
        System.out.println(current.length() == 0 ? "YES" : "NO");
    }
    private StringBuilder remove(StringBuilder sb, String search) {
        StringBuilder result = new StringBuilder();
        char[] d = search.toCharArray();
        int length = search.length();
        for (int i = 0; i < sb.length(); i++) {
            boolean ng = false;
            for (int j = 0; j < length; j++) {
                if (sb.length() <= i + j) {
                    ng = true;
                    break;
                }
                if (sb.charAt(i+j) != d[j]) {
                    ng = true;
                    break;
                }
            }
            if (!ng) {
                i = i + length - 1;
                continue;
            }
            result.append(sb.charAt(i));
        }
        return result;
    }
}
