import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by darshan on 5/30/19.
 */
public class Main {
    private static long[] sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        sum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + seq[i];
        }
        long ans = Long.MAX_VALUE;
        for (int i = 2; i < n - 1; i++) {
            long[][] leftPartitions = partition(0, i);
            long[][] rightPartitions = partition(i, n);
            for (long[] left : leftPartitions) {
                for (long[] right : rightPartitions) {
                    long max = Math.max(Math.max(left[0], left[1]), Math.max(right[0], right[1]));
                    long min = Math.min(Math.min(left[0], left[1]), Math.min(right[0], right[1]));
                    ans = Math.min(ans, max - min);
                }
            }
        }
        System.out.println(ans);
    }

    private static long[][] partition(int exclusiveStart, int inclusiveEnd) {
        if (inclusiveEnd - exclusiveStart < 2) {
            throw new RuntimeException("inclusiveEnd - exclusiveStart must be >= 2");
        }
        int partitionLeft = exclusiveStart;
        // Exclude rightmost element to ensure at least one partition will always exist
        int partitionRight = inclusiveEnd - 1;
        while (partitionRight - partitionLeft > 1) {
            int mid = (partitionLeft + partitionRight) / 2;
            long sumLeft = sum[mid] - sum[exclusiveStart];
            long sumRight = sum[inclusiveEnd] - sum[mid];
            if (sumLeft >= sumRight) {
                partitionRight = mid;
            } else {
                partitionLeft = mid;
            }
        }
        if (partitionRight > exclusiveStart + 1) {
            return new long[][] {
                    { sum[partitionRight] - sum[exclusiveStart], sum[inclusiveEnd] - sum[partitionRight] },
                    { sum[partitionRight - 1] - sum[exclusiveStart], sum[inclusiveEnd] - sum[partitionRight - 1] }
            };
        } else {
            return new long[][]{
                    { sum[partitionRight] - sum[exclusiveStart], sum[inclusiveEnd] - sum[partitionRight] }
            };
        }
    }
}
