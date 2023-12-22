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
        int N = scan.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        Arrays.sort(A);
        long ans = method1(A);
        ans = Math.max(ans,method2(A));
        System.out.println(ans);
    }
    private long method2(long[] A) {
        int N = A.length;
        long ans = 0;
        if (N % 2 == 0) {
            for (int i = N-1; 0 <= i; i--) {
                if (N / 2 < i) {
                    ans += A[i] * 2;
                    continue;
                }
                if (N / 2 == i) {
                    ans += A[i];
                    continue;
                }
                if (N / 2 - 1 == i) {
                    ans -= A[i];
                    continue;
                }
                ans -= A[i]*2;
            }
        } else {
            for (int i = N-1; 0 <= i; i--) {
                if (N / 2 < i) {
                    ans += A[i] * 2;
                    continue;
                }
                if (N / 2 - 1 <= i) {
                    ans -= A[i];
                    continue;
                }
                ans -= A[i] * 2;
            }
        }
        return ans;
    }
    private long method1(long[] A) {
        int N = A.length;
        long ans = 0;
        if (N % 2 == 0) {
            for (int i = N-1; 0 <= i; i--) {
                if (N / 2 < i) {
                    ans += A[i] * 2;
                    continue;
                }
                if (N / 2 == i) {
                    ans += A[i];
                    continue;
                }
                if (N / 2 - 1 == i) {
                    ans -= A[i];
                    continue;
                }
                ans -= A[i]*2;
            }
        } else {
            for (int i = N-1; 0 <= i; i--) {
                if (N / 2 + 1 < i) {
                    ans += A[i] * 2;
                    continue;
                }
                if (N / 2 <= i) {
                    ans += A[i];
                    continue;
                }
                ans -= A[i]*2;
            }
        }
        return ans;
    }
}
