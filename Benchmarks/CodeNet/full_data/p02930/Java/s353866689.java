import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int max_color = 0;
        int current = 1;
        while (current < N) {
            current *= 2;
            max_color += 1;
        }
        int[] nodes = new int[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = i;
        }
        for (int i = 0; i < N-1; i++) {
            int x = nodes[i];
            StringBuilder sb = new StringBuilder();
            for (int j = i + 1; j < N; j++) {
                int y = nodes[j];
                sb.append(level(x, y));
                sb.append(" ");
            }
            System.out.println(sb.substring(0, sb.length()-1));
        }
    }
    private int level(int x, int y) {
        int z = x ^ y;
        int level = 1;
        while ((z & 1) == 0) {
            z = z >> 1;
            level += 1;
        }
        return level;
    }
}
