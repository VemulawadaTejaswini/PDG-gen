import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] A = new long[n];
        long ans = Long.MAX_VALUE;
        for(int i = 0; i < n; i++) A[i] = sc.nextLong();
        for(int i = 0; i < 1<<n; i++) {
            long m = A[0];
            long sum = 0;
            if(Integer.bitCount(i) != k - 1 ||
               (i>>n-1 & 1) == 1) continue;
            for(int j = n-2; j >= 0; j--) {
                long inc = 0;
                if((i>>j & 1) == 1) {
                    if(A[n-j-1] <= m) {
                        inc = m - A[n-j-1] + 1;
                    }
                }
                m = Math.max(m, A[n-j-1]+inc);
                sum += inc;
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}
