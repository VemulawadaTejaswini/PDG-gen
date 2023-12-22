import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] b = new int[64];
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            long a = sc.nextLong();
            A[i] = a;
            int j = 0;
            while (a > 0) {
                if (a%2 == 1) {
                    b[j]++;
                }
                a /= 2;
                j++;
            }
        }

        long pow = 1;
        int j = 0;
        long x = 0;
        while (K > 0) {
            if (K%2 == 1 && 2*b[j] <= N) {
                x += pow;
            }
            K /= 2;
            j++;
            pow *= 2;
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += A[i]^x;
        }

        System.out.println(ans);
    }
}
