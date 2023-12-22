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
        int K = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        int group = 1;
        char current = data[0];
        for (int i = 1; i < data.length; i++) {
            if (current == data[i]) {
                continue;
            }
            current = data[i];
            group += 1;
        }
        for (int i = 0; i < K; i++) {
            if (2 < group) {
                group -= 2;
                continue;
            }
            if (group == 2) {
                group = 1;
                continue;
            }
            break;
        }
        System.out.println(N - group);
    }
}
