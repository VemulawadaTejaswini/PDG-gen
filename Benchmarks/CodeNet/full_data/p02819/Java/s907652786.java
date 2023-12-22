import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        boolean[] primes = new boolean[200001];
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i * i <= 200000; i++) {
            for (int j = i * 2; j <= 200000; j += i) {
                primes[j] = false;
            }
        }
        for (int i = X; i <= 200000; i++) {
            if (primes[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}
