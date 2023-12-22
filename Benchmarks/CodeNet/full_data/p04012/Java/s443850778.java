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
        int[] c = new int[26];
        for (char x : d) {
            c[x - 'a'] += 1;
        }
        boolean answer = true;
        for (int i = 0; i < 26; i++) {
            if (c[i] % 2 != 0) {
                answer = false;
                break;
            }
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
