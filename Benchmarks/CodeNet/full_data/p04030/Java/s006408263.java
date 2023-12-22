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
        char[] d = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char x : d) {
            if (x == '0') {
                sb.append('0');
            }
            if (x == '1') {
                sb.append('1');
            }
            if (x == 'B' && 1 <= sb.length()) {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        System.out.println(sb.toString());
    }
}
