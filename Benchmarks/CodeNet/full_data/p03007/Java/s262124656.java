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
        int N = scan.nextInt();
        long[] a = new long[N];
        long sum = 0;
        int count_negative = 0;
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextLong();
            sum += a[i];
            if (a[i] < 0) {
                count_negative += 1;
            }
        }
        int count_positive = N - count_negative;
        Arrays.sort(a);
        if (count_negative == 0) {
            long answer = sum - a[0]*2;
            System.out.println(answer);
            long current = a[0];
            for (int i = 1; i < N - 1; i++) {
                System.out.println(current + " " + a[i]);
                current -= a[i];
            }
            System.out.println(a[N - 1] + " " + current);
        } else if (count_positive == 0) {
            // a1, a2, ... ,an-1,an
            long answer = a[N-1] - (sum - a[N-1]);
            System.out.println(answer);
            long current = a[N-1];
            for (int i = 0; i < N - 1; i++) {
                System.out.println(current + " " + a[i]);
            }
        } else {
            long answer = sum - a[0]*2;
            System.out.println(answer);
            long current = a[0];
            for (int i = 1; i < N - 1; i++) {
                System.out.println(current + " " + a[i]);
                current -= a[i];
            }
            System.out.println(a[N - 1] + " " + current);
        }
    }
}