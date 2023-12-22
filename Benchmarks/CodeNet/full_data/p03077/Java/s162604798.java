import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        long[] capacity = new long[5];
        for (int i = 0; i < 5; i++) {
            capacity[i] = scan.nextLong();
        }
        Arrays.sort(capacity);
        long answer = N % capacity[0] == 0 ? N / capacity[0] + 4 : N / capacity[0] + 5;
        System.out.println(answer);
    }
}
