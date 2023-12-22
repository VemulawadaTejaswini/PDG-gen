import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        String correct = "CODEFESTIVAL2016";
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] c = correct.toCharArray();
        char[] d = S.toCharArray();
        int answer = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != d[i]) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
