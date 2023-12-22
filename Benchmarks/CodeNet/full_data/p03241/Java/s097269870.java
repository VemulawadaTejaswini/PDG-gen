import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int ans = 1;
        for (int i = 2; i <= m; i++) {
            if (m%n == 0) {
                ans = m/n;
                break;
            }
            if (m % i == 0) {
                if (i * n <= m) ans = i;
            }
        }
        System.out.println(ans);
    }
}
