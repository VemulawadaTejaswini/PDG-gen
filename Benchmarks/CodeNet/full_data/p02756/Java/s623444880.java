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
        String S = scan.next();
        int Q = scan.nextInt();
        boolean order = true;
        StringBuilder sb = new StringBuilder();
        sb.append(S);
        for (int i = 0; i < Q; i++) {
            int type = scan.nextInt();
            if (type == 1) {
                order = !order;
                continue;
            }
            int F = scan.nextInt();
            char c = scan.next().toCharArray()[0];
            if (order) {
                if (F == 1) {
                    sb.insert(0, c);
                } else {
                    sb.append(c);
                }
            } else {
                if (F == 1) {
                    sb.append(c);
                } else {
                    sb.insert(0, c);
                }
            }
        }
        if (order) {
            System.out.println(sb.toString());
        } else {
            System.out.println(sb.reverse().toString());
        }
    }
}
