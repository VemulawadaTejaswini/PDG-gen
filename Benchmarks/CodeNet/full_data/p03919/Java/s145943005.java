import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        int ans_H = 0;
        int ans_W = 0;
        for (int i = 1; i <= H; i++) {
            for (int j = 0; j < W; j++) {
                String s = scan.next();
                if ("snuke".equals(s)) {
                    ans_H = i;
                    ans_W = j;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append((char)((int)'A'+ans_W));
        sb.append(ans_H);
        System.out.println(sb.toString());
    }
}
