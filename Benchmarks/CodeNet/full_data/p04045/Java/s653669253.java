import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int K = scan.nextInt();
        boolean[] d = new boolean[10];
        for(int i = 0; i < K; i++) {
            d[scan.nextInt()] = true;
        }
        int current = N;
        while (true) {
            String t = Integer.toString(current);
            char[] digits = t.toCharArray();
            boolean ok = true;
            for (int i = 0; i < digits.length; i++) {
                if (d[digits[i]-'0']) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                break;
            }
            current += 1;
        }
        System.out.println(current);
    }
}
