import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        int N = scan.nextInt();
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < N / 2; i++) {
            alice += a[2*i];
            bob += a[2*i + 1];
        }
        if (N % 2 == 1) {
            alice += a[N-1];
        }
        System.out.println(alice - bob);
    }
}
