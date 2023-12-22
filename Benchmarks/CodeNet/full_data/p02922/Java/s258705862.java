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
        long A = scan.nextLong();
        long B = scan.nextLong();
        if (B == 1) {
            System.out.println(0);
            return;
        }
        long depth = 0;
        long current = 1;
        while (current < B)  {
            depth += 1;
            current *= A;
        }
        long target_sockets = p(A, depth - 1);
        long current_sockets = target_sockets;
        long answer = s(A, depth - 2);
        current = 0;
        for (long i = 0; i < target_sockets; i++) {
            current += A;
            answer += 1;
            if (B <= current + target_sockets - i - 1) {
                break;
            }
        }
        System.out.println(answer);
    }
    private long s(long A, long n) {
        long x = p(A, n + 1) - 1;
        return x / (A - 1);
    }
    private long p(long A, long depth) {
        int current = 1;
        for (long i = 0; i < depth; i++) {
            current *= A;
        }
        return current;
    }
}
