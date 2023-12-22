import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        long[] A = new long[N];
        long[] xor = new long[N+2];
        long[] sum = new long[N+2];
        sum[N+1] = -810;
        for (int i=0;i<N;i++) {
            A[i] = Long.parseLong(sc.next());
            xor[i+1] = xor[i]^A[i];
            sum[i+1] = sum[i] + A[i];
        }

        int right = 0;
        long ans = 0L;
        for (int left=0;left<N;left++) {
            while (sum[right+1]-sum[left]==(xor[right+1]^xor[left])) {
                right++;
            }
            ans += (long)(right-left);
        }
        System.out.println(ans);
    }
}