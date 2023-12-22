import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N  = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        int[] digits = new int[60];
        for (int i = 0; i < N; i++) {
            int point = 0;
            long current = 1;
            while(0 < A[i]) {
                if (0 < (A[i] & current)) {
                    digits[point] += 1;
                }
                A[i] /= 2;
                point += 1;
            }
        }
        long answer = 0;
        long current = 1;
        long mod = 1000000007;
        for (int i = 0; i < 60; i++) {
            long x = digits[i] * (N-digits[i]);
            x %= mod;
            long y = current;
            y %= mod;
            long z = x * y;
            z %= mod;
            answer += z;
            answer %= mod;
            current *= 2;
            current %= mod;
        }
        System.out.println(answer);
    }
}
