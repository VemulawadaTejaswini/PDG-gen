import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        char[] d = S.toCharArray();
        long answer = 0;
        StringBuilder current = new StringBuilder();
        StringBuilder prev = new StringBuilder();
        for (int i = 0; i < d.length; i++) {
            current.append(d[i]);
            if (!prev.toString().equals(current.toString())) {
                answer += 1;
                prev = current;
                current = new StringBuilder();
                continue;
            }
        }
        System.out.println(answer);
    }
}
