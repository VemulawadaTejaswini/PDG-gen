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
        long K = scan.nextLong();
        if (K == 0) {
            System.out.println(2);
            System.out.println("1 1");
            return;
        }
        if (K == 1) {
            System.out.println(2);
            System.out.println("3 0");
            return;
        }
        long[] a = new long[50];
        for (int i = 0; i < 50; i++) {
            a[i] = Math.floorDiv(K, 50) + i;
        }
        long remain = K - Math.floorDiv(K, 50) * 50;
        for (long i = 0; i < remain; i++) {
            for (int j = 0; j < 50; j++) {
                if (j == 0) {
                    a[j] += 50;
                    continue;
                }
                a[j] -= 1;
            }
            Arrays.sort(a);
        }
        System.out.println(50);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            sb.append(a[i]);
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
        return;
    }
}
