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
        int M = scan.nextInt();
        int[] p = new int[M];
        boolean[] result = new boolean[N];
        int[] wa_list = new int[N];
        for (int i = 0; i < M; i++) {
            p[i] = scan.nextInt()-1;
            String s = scan.next();
            boolean is_ac = "AC".equals(s) ? true : false;
            if (is_ac) {
                result[p[i]] = is_ac;
            }
            if (!is_ac && !result[p[i]]) {
                wa_list[p[i]] += 1;
            }
        }
        int ac_count = 0;
        int wa_count = 0;
        for (int i = 0; i < N; i++) {
            if (result[i]) {
                ac_count += 1;
                wa_count += wa_list[i];
            }
        }
        System.out.printf("%d %d\n", ac_count, wa_count);
    }
}
