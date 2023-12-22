import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a = new long[n], sum = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            sum[i] = a[i] + (i == 0 ? 0 : sum[i - 1]);
        }
        int ab = 0, cd = 2;
        long ans = Long.MAX_VALUE;
        for (int bc = 1; bc < n - 1; bc++) {
            while (ab < bc - 1 
                && Math.abs(sum[bc] - sum[ab + 1] * 2) 
                <  Math.abs(sum[bc] - sum[ab] * 2)) {
                ab++;
            }
            while (cd < n - 1 
                && Math.abs(sum[n - 1] - sum[cd + 1] * 2 + sum[bc]) 
                <  Math.abs(sum[n - 1] - sum[cd] * 2 + sum[bc])) {
                cd++;
            }
            long[] arr = { sum[ab], sum[bc] - sum[ab], sum[cd] - sum[bc], sum[n - 1] - sum[cd] };
            Arrays.sort(arr);
            ans = Math.min(ans, arr[3] - arr[0]);
        }
        System.out.println(ans);
    }
}
