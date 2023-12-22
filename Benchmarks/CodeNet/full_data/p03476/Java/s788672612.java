import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        int Q = scan.nextInt();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for (int i = 0; i < Q; i++) {
            l[i] = scan.nextInt();
            r[i] = scan.nextInt();
        }
        int MAX = 100000;
        boolean[] prime = new boolean[MAX + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (!prime[i]) {
                continue;
            }
            for (int j = 2; i * j <= MAX; j++) {
                prime[i * j] = false;
            }
        }
        Set<Integer> primes = new HashSet<>();
        for (int i = 0; i <= MAX; i++) {
            if (prime[i])  {
                primes.add(i);
            }
        }
        boolean[] likeN = new boolean[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            if (!primes.contains(i)) {
                continue;
            }
            if (primes.contains((i + 1) / 2)) {
                likeN[i] = true;
            }
        }
        int[] sum = new int[MAX+1];
        sum[0] = 0;
        for (int i = 1; i <= MAX; i++) {
            sum[i] = sum[i-1] + (likeN[i] ? 1 : 0);
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(sum[r[i]]-sum[l[i]-1]);
        }
    }
}
