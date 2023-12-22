import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = scan.nextInt();
        }
        Arrays.sort(d);
        System.out.println(d[N/2]-d[N/2-1]);
    }
}
