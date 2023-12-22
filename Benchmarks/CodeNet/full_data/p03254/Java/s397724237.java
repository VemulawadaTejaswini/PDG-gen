import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        long x = Long.parseLong(sc.next());
        long[] a = new long[N];
        int ans = 0;
        for (int i = 0; i < N; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        Arrays.sort(a);
        while (x >= a[0]) {
            for (int i = 0; i < N; i++) {
                if (x == 0 || x < a[i]) {
                    break;
                } else {
                    x -= a[i];
                    ans++;
                }
            }
            for (int i = N-1; i >= 0; i--) {
                if (x >= a[i]) {
                    x -= a[i];
                    ans--;
                }
            }
        }
        out.println(ans);
        
        out.flush();
    }
    static boolean isPrimeNumber(int targetNum) {
        boolean result = true;
        int sqrt = (int)Math.sqrt(targetNum);
        for (int i = 2; i <= sqrt; i++) {
            if (targetNum % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}