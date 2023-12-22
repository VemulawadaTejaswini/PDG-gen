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
        long N = scan.nextLong();
        int M = scan.nextInt();
        long[] A = new long[M];
        for (int i = 0; i < M; i++) {
            A[i] = scan.nextLong();
        }
        long sum = Arrays.stream(A).sum();
        if (N < sum) {
            System.out.println(-1);
        } else {
            System.out.println(N-sum);
        }
    }
}
