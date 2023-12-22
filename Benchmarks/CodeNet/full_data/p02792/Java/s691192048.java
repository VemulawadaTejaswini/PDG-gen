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
        int N = scan.nextInt();
        int[] prefix_postfix_digits = new int[100];
        for (int i = 1; i <= N; i++) {
            String s = Integer.toString(i);
            char[] d = s.toCharArray();
            int len = d.length;
            char first = d[0];
            char last = d[len - 1];
            int index = ((int)first-'0')*10 + ((int)last-'0');
            prefix_postfix_digits[index] += 1;
        }
        long ans = 0;
        for (int i = 11; i < 100; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (prefix_postfix_digits[i]==0) {
                continue;
            }
            int r = (i % 10) * 10 + i / 10;
            if (prefix_postfix_digits[r]==0) {
                continue;
            }
            ans += ((long) prefix_postfix_digits[i]) * ((long) prefix_postfix_digits[r]);
        }
        System.out.println(ans);
    }
}
